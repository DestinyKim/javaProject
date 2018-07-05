package test.com;

public class LocalOut {
	
	public void test() {
		class Inner{
			public void aaa() {
				System.out.println("aaa()...");
			}
		}
		Inner in = new Inner();
		in.aaa();
	}

}
