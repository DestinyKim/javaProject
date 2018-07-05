package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test06IO {

	public static void main(String[] args) throws IOException {
		System.out.println("input  output");
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("input your name:");
		String name = br.readLine();
		System.out.println(name);
		
		System.out.println("input kor score:");
		String kor = br.readLine();
		System.out.println(Integer.parseInt(kor));
		
	}

}
