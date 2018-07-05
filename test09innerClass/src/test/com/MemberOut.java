package test.com;

public class MemberOut {
	
	public int num;
	
	public void run() {
//		Inner in = new Inner();
	}
	
	public class Inner {
		String name = "kim";
		public String getName() {
			System.out.println(num);
//			run();
			return name;
		}
		public void test() {
			System.out.println(num);
		}
	}

}
