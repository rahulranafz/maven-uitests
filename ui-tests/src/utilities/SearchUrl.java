package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchUrl {

	public String search() throws IOException {

		String url = "";
		StringBuilder sb = new StringBuilder();
		String currentUsersDir = System.getProperty("user.dir");
		String filepath = currentUsersDir + "\\temporary\\out.txt";
		FileReader file = new FileReader(filepath);
		BufferedReader br = new BufferedReader(file);
		try {
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append("\n");
				line = br.readLine();
			}
			url = url + sb.toString();

		} finally {
			br.close();
		}

		int i1 = url.indexOf("href=\"orderbook.io") + 6;
		int i2 = url.indexOf("\" target=");
		String activationUrl = url.substring(i1, i2);
		System.out.println(activationUrl);
		return activationUrl;
	}

	public static void main(String[] args) throws IOException {
		SearchUrl searchurl = new SearchUrl();
		String activationUrl = "";

		activationUrl = searchurl.search();
		System.out.println(activationUrl);
	}

}