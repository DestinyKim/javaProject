package test.com;

public class Test03for {

	public static void main(String[] args) {
		System.out.println("for...");
		
		//반복수행,실행
		//for : 길이,카운트,용량 등과 관련된 반복
		for (int i = 0; i < 10; i++) {
			System.out.println("aaa"+i);
		}
		
		
		for (int i = 9; i >= 0; i--) {
			System.out.println("bbb"+i);
		}
		
		for (int i = 0; i < 10; i++) {
			
			if(i%2 != 0)System.out.println("ccc"+i);
		}
		
		for (int i = 0; i < 10; i+=4) {
			System.out.println("ddd"+i);
		}
		
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println("eee"+i);
			System.out.println((int)i);
		}
		
		
		
		
		
	}//end main()

}//end class


