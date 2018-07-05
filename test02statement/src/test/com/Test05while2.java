package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test05while2 {

	public static void main(String[] args) throws IOException {
		System.out.println("while");

		InputStream is = System.in;;//.을 찍으면 안될때는 초기화일 때
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		int i = 0;
		while (i < 10) {
			System.out.println("aaaa" + i);
			i++;
			if(i==5)break;
		} // 무한루프, 전원이 차단되기 전까지 모든 프로그램은 무한반복으로 작동중.
	
		String x = "";
		while (!x.equals("X")) {
			System.out.println("종료시 x 입력...");
			x = br.readLine();
			
		}
		
	}//end main
}//end class

