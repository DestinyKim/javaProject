package test.com;

public class Test03for2 {

	public static void main(String[] args) {
		System.out.println("for2...");
		
		//0~9
		for (int x = 0; x < 3; x++) {
			for (int i = 0; i < 10; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("=======");
		
		
		for (int y = 0; y < 2; y++) {
			for (int x = 0; x < 3; x++) {
				for (int i = 0; i < 10; i++) {
					System.out.print(i);
				}
				System.out.println();
			}
			System.out.println("=======");
		}
		
		
		
	}//end main()

}//end class


