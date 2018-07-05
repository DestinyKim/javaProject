package test.com;

public class Test02Student {

	int num;// 번호 일반전역변수에 속성을 부여함
	String name;// 이름
	int kor;// 국어
	int eng;// 영어
	int math;// 수학
	int total;// 합계
	double avg;// 평균
	String grade;// 등급

	//클래스 안의 생성자는 동일한 생성자는 만들수 없다.
	//단, 매개변수(소괄호 안에 선언된 변수, 인ㄴ자)의 개수, 순서, 타입종류가 다르면 생성가능
	
	//매개변수가 없는 생성자>>기본생성자
	//기본생성자가 실행문이 없을때는 생략 가능
	public Test02Student() {
		// contructor 생성자
		System.out.println("Test02Student()....");
//		System.out.println(num);
		num = 3;
//		System.out.println(num);
	}
	public Test02Student(int x/*타입선언*/) {
		// contructor 생성자
	}
	public Test02Student(int x, int y) {
		// contructor 생성자
	}
	public Test02Student(String x, int y) {
		// contructor 생성자
	}
	public Test02Student(String x) {
		// contructor 생성자
	}
	public Test02Student(int aaa, String qqq) {
		// contructor 생성자
	}
	
	public static void main(String[] args) {

		System.out.println("student....info");
		
		// className objectName = new연산자 생성자();
		Test02Student st = new Test02Student();
		System.out.println(st);
		System.out.println(st.num);
		st.num = 8;
		System.out.println(st.num);
	}

}
