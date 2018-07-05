package test.com;

public class Test04Mouse {
	
	int pNum;
	String color;
	String country;
	boolean isWheel;
	byte isLen;
	
	//오버로딩 overloading
	public Test04Mouse() {
		pNum = 88;
		color = "led";
		country = "kor";
		isWheel = true;
		isLen = 1;
	}

	public Test04Mouse(int i, String string, String string2, boolean b, int j) {
		pNum = i;
		color = string;
		country = string2;
		isWheel = b;
		isLen =  (byte)j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(args.length);
//		for (String x : args) {
//			System.out.println(x);
//		}
		
		Test04Mouse m = new Test04Mouse();
		System.out.println(m.pNum);
		System.out.println(m.color);
		System.out.println(m.country);
		System.out.println(m.isWheel);
		System.out.println(m.isLen);
		m.pNum = 33;
		m.color = "blue";
		m.country = "us";
		m.isWheel = false;
		m.isLen = 3;
		System.out.println(m.pNum);
		System.out.println(m.color);
		System.out.println(m.country);
		System.out.println(m.isWheel);
		System.out.println(m.isLen);
		
		//1.임의의 제품번호,컬러,제조국,휘유무,선유무를 
		//한방에 제공해서 객체를 생성한후 정보를 출력하세요.
		Test04Mouse tm = 
				new Test04Mouse(1,"gold","ge",false,1);
		System.out.println(tm.pNum);
		System.out.println(tm.color);
		System.out.println(tm.country);
		System.out.println(tm.isWheel);
		System.out.println(tm.isLen);
		//2.휴대폰객체를 위한 새로운 클래스를 만들어서
		//아무정보도 안주는 객체생성 후 출력
		
		
	}

}
