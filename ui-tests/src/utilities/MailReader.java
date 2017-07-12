package utilities;

import java.io.*;
import java.util.*;
import javax.mail.*;
import javax.mail.Flags.Flag;
import javax.mail.search.FlagTerm;

public class MailReader {

	Folder inbox;

	// Constructor of the class.
	public void FetchMails(String host, String username, String password) {
		/* Set the mail properties */
		Properties props = System.getProperties();
		props.setProperty("mail.store.protocol", "imaps");
		try {
			/* Create the session and get the store for read the mail. */
			Session session = Session.getDefaultInstance(props, null);
			Store store = session.getStore("imaps");
			store.connect(host, username, password);

			/* Mention the folder name which you want to read. */
			inbox = store.getFolder("Inbox");
			System.out.println("No of Unread Messages : " + inbox.getUnreadMessageCount());

			/* Open the inbox using store. */
			inbox.open(Folder.READ_ONLY);

			/* Get the messages which is unread in the Inbox */
			Message messages[] = inbox.search(new FlagTerm(new Flags(Flag.SEEN), false));

			/* Use a suitable FetchProfile */
			FetchProfile fp = new FetchProfile();
			fp.add(FetchProfile.Item.ENVELOPE);
			fp.add(FetchProfile.Item.CONTENT_INFO);
			inbox.fetch(messages, fp);

			try {
				printAllMessages(messages);
				inbox.close(true);
				store.close();
			} catch (Exception ex) {
				System.out.println("Exception arise at the time of read mail");
				ex.printStackTrace();
			}
		} catch (NoSuchProviderException e) {
			e.printStackTrace();
			System.exit(1);
		} catch (MessagingException e) {
			e.printStackTrace();
			System.exit(2);
		}
	}

	public void printAllMessages(Message[] msgs) throws Exception {
		for (int i = 0; i < msgs.length; i++) {
			System.out.println("MESSAGE #" + (i + 1) + ":");
			printEnvelope(msgs[i]);
		}
	}

	/* Print the envelope(FromAddress,ReceivedDate,Subject) */
	public void printEnvelope(Message message) throws Exception {
		Address[] a;
		// FROM
		if ((a = message.getFrom()) != null) {
			for (int j = 0; j < a.length; j++) {
				System.out.println("FROM: " + a[j].toString());
			}
		}
		// TO
		if ((a = message.getRecipients(Message.RecipientType.TO)) != null) {
			for (int j = 0; j < a.length; j++) {
				System.out.println("TO: " + a[j].toString());
			}
		}

		String subject = message.getSubject();
		if (subject.equals("Welcome to Orderbook.io!")) {
			String content = message.getContent().toString();
			System.out.println("Content : " + content);
			getContent(message);
		}
	}

	public void getContent(Message msg) {
		try {
			String contentType = msg.getContentType();
			System.out.println("Content Type : " + contentType);
			Multipart mp = (Multipart) msg.getContent();
			// System.out.println("app:" +dumpPart(mp.getBodyPart(0));

			int count = mp.getCount();
			for (int i = 0; i < count; i++) {
				dumpPart(mp.getBodyPart(i));
			}
		} catch (Exception ex) {
			System.out.println("Exception arise at get Content");
			ex.printStackTrace();
		}
	}

	public void dumpPart(Part p) throws Exception {
		// Dump input stream ..
		InputStream is = p.getInputStream();
		if (!(is instanceof BufferedInputStream)) {
			is = new BufferedInputStream(is);
		}

		int c;
		System.out.println("Message : ");
		while ((c = is.read()) != -1) {
			System.out.write(c);

		}
		String currentUsersDir = System.getProperty("user.dir");
		String filepath = currentUsersDir + "\\temporary\\out.txt";
		PrintStream myconsole = new PrintStream(new File(filepath));
		System.setOut(myconsole);
		myconsole.print(p.getContent());
	}

	public static void main(String[] args) {
		String host = "imap.gmail.com";// change accordingly
		String username = "ambisafetest@gmail.com";// change accordingly
		String password = "ronnit1029";// change accordingly
		MailReader mr = new MailReader();
		mr.FetchMails(host, username, password);
	}
}