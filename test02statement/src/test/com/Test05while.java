package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class Test05while {

	public static void main(String[] args) throws IOException {
		System.out.println("while");
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		int i =0;
		while (i<10) {
			System.out.println("aaaa"+i);
			i++;
			if(i==6)break;
		}
		
		String x = "x";
		while (!x.equals("x")) {
			System.out.println("종료시 x입력...");
			x = br.readLine();
			
		}
		
		System.out.println("end main...");
	}

}
