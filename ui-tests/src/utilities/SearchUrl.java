package utilities;

import java.io.FileNotFoundException;

public class SearchUrl {

	public String search(String content, String subject) throws FileNotFoundException {

		if (subject == "Please verify your email address") {
			int i1 = content.indexOf(">http:") + 1;
			int i2 = content.indexOf("/</a>");
			String activationUrl = content.substring(i1, i2);
			System.out.println("Activation Url :" + activationUrl);
			return activationUrl;
		} else {
			int i1 = content.indexOf("<p>Code:") + 9;
			int i2 = content.indexOf("<p>Best regards");
			String subPart = content.substring(i1, i2);
			int i3 = subPart.indexOf("</p>") - 5;
			int i4 = subPart.indexOf("</p>");
			String activationCode = subPart.substring(i3, i4);
			System.out.println("Activation Code :" + activationCode);
			return activationCode;
		}

	}
}
