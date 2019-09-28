package jSon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrowserHTTP {
	private List<String> cookies;

	public String sendGet(String my_url, boolean saveCookies) throws IOException {
		String response = "";
		URL url = new URL(my_url);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		if (!saveCookies) {
			for (String cookie : cookies) {
				con.addRequestProperty("Cookie", cookie.split(";", 2)[0]);
			}
		} else {
			cookies = con.getHeaderFields().get("Set-Cookie");
			/*System.out.println(cookies.toString());*/
		}
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			response = response + inputLine;
		}

		in.close();
		/*System.out.println(response);*/
		return response;

	}

	public List<String> getCookiesHeader() {
		return cookies;
	}

	public void setCookiesHeader(List<String> cookies) {
		this.cookies = cookies;
	}

}
