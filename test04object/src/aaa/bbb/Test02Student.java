package aaa.bbb;

public class Test02Student {

	int num;//번호
	String name;//이름
	int kor;//국어
	int eng;
	int math;
	int total;
	double avg;
	String grade;
	
	//클래스 안의 생성자는 동일한 생성자는 만들수 없다.
	//단,매개변수(소괄호 안에 선언된 변수,인자)의 개수,순서,타입 다르면 생성가능
	
	//매개변수가 없는 생성자>>> 기본생성자
	//기본생성자가 실행문이 없을때는 생략가능
	public Test02Student() {
		//contructor 생성자
		System.out.println("Test02Student().....");
//		System.out.println(num);
		num = 3;
//		System.out.println(num);
	}
	public Test02Student(int x) {
		//contructor 생성자
	}
	
	
	public Test02Student(int aaa,String qqq) {
		//contructor 생성자
	}
	public Test02Student(String x) {
		//contructor 생성자
		name = x;
	}
	
	public Test02Student(String name, int kor) {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		System.out.println("student....info");
		
		//className  objectName = new연산자 생성자();
		Test02Student st = new Test02Student("kim",88);
		System.out.println(st);
		System.out.println(st.num);
		st.num = 8;
		System.out.println(st.num);
		
		Test02Student st2 = new Test02Student(99,"88");
		
		System.out.println(st2.kor);
		System.out.println(st2.eng);
	}

}
