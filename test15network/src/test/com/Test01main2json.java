package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.MalformedInputException;

import org.json.JSONArray;
import org.json.JSONObject;

public class Test01main2json {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("network...");

		try {
			String address = "http://192.168.0.163/IOTstudy177/javaProject/test15network/data2.txt";
			URL url = new URL(address);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			InputStream is = conn.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			StringBuilder data = new StringBuilder();
			String str = "";
			while ((str = br.readLine()) != null) {
				data.append(str);
				
			}
			System.out.println(data.toString());
			
			JSONArray array = new JSONArray(data.toString());
			for (int i = 0; i < array.length(); i++) {
				JSONObject obj = array.getJSONObject(i);
				System.out.println(obj.getString("name"));
				
			}

		} catch (MalformedInputException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
