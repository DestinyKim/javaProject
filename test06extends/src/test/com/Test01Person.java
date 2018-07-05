package test.com;

public /*final*/ class Test01Person /*extends Object*/{

	final String sid = "aaa";//주민번호
	String name;//이름
	int fm;//
	String address;
	
	public Test01Person() {
		System.out.println("Test01Person()...");
		//sid = "989898";
		name = "kim";
		fm = 0;
		address = "seoul";
	}
	
	

	public /*final*/ void ppp() {
		System.out.println("Person.ppp()");
	}
	public void ppp2() {
		ppp();
	}
	public static void ppp3() {
		
	}
	
}
