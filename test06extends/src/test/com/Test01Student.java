package test.com;

public class Test01Student extends Test01Person{
	int num;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	String grade;
	
	
	public Test01Student() {
		//super();
		System.out.println("Test01Student()...");
		num = 23;
		kor = 100;
		eng = 90;
		math = 80;
		//sid = "aaa";
		
	}
	public Test01Student(int x) {
		this();
		num = x;
		System.out.println("Test01Student(int x)...");
	}
	public Test01Student(int kor,int eng) {
		//super(8);
		this.kor = kor;
		this.eng = eng;
		System.out.println("Test01Student(int kor,int eng)...");
	}
	
	//@선언:annotation
	//상속이 전제,리턴타입과 매개변수타입 동일하게 재정의
	@Override
	public void ppp() {
		System.out.println("Student.ppp()");
		
	}
	
	public void sss() {
		super.ppp();
	}
}
