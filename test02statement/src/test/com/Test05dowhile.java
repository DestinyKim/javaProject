package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class Test05dowhile {

	public static void main(String[] args) throws IOException {
		System.out.println("while");
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		
		
		String x = "x";
		do{
			System.out.println("종료시 x입력...");
			x = br.readLine();
			
		}while (!x.equals("x"));
		
		System.out.println("end main...");
	}

}
