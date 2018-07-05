package test.com;

import java.util.StringTokenizer;

public class Test01spritToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//90:80:70
		String str = "90:80:70";
		String[] temp = str.split(":");
		int total = 0 ;
		for (String x : temp) {
			total += Integer.parseInt(x);
		}
		System.out.println(total);
		
		StringTokenizer st = new StringTokenizer(str) ;
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken(":"));
		}
	}

}
