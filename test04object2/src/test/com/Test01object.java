package test.com;

public class Test01object {

	// 제원, 속성, 멤버필드, 멤버변수, 전역변수, 인스턴스변수
	int su; // 0 클래스에선 초기값이 자동할당
	String name; // null
	Test01object obj = new Test01object(); // 변수에 주소를 할당. 변수가 null이 아니게 해줌.(할당문)
	int [] sus;
	public static void main(String[] args) {
		
		System.out.println("object");
		
		Test01object obj = new Test01object();
		System.out.println(obj);
				
	}

}
