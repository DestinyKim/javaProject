package test.com;

public class Test02My {
	
	//속성,전역변수,멤버변수(멤버필드)
	int age = 44;
	String email = "aaa@aaa.com";

	
	//동작,기능
	public static void main(String[] args) {
		// 지역변수,로컬변수,local variable
		int age = 44;
		System.out.println(age);
		age = 55;
		long longsu = 4444444444444444444L;
		char csu = 33;
		char cmunja = '가';
		short ssu = 6666;
		byte bsu = 127;
		
		double dsilsu = 3.14;
		float fsilsu = 3.14f;
		
		String email = "aaa@aaa.com";//참조자료형
		System.out.println(email);
		
		boolean bool = false;//true
		bool = true;
		System.out.println(bool);
		System.out.println(Boolean.FALSE+","+Boolean.TRUE);
		
	}

}
