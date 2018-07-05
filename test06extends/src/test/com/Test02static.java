package test.com;

public class Test02static {
	static String name;
	public void aaa() {
		Test02static.bbb();
	}
	public static void bbb() {
		
	}
	
	

	public static void main(String[] args) {
		Test02static st = new Test02static();
		st.aaa();
		
		Test02static.bbb();
		String n = Test02static.name;

	}

}
