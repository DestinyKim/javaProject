package test.com;

public class Test03Main {
	static String k_name;

	public static void main(String[] args) {
		System.out.println("interface...");
		
		System.out.println(Test03product.P_NAME);
		//Test03product.P_NAME = "";
		System.out.println(Test03Main.k_name);
		Test03Main.k_name = "aaa";
		
		Test03AbsClass ac = new Test03AbsClass() {

			@Override
			public int aaa2(int x) {
				System.out.println(x);
				return 0;
			}
			
		};
		Test03AbsClass x = new Test03AbsClass() {
			
			@Override
			public int aaa2(int x) {
				System.out.println(x);
				return 0;
			}
			
		};
		ac.aaa();
		ac.aaa2(99);
		
		Test03AbsClass ac2 = new Test03AbsClassEx();
		ac2.aaa();
		ac2.aaa2(88);
		
		Test03product pro = new Test03product() {
			
			@Override
			public void test3() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public int insert(String[] names) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
	}

}