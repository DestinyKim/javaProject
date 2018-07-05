package test.com;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("main...상속");
		
		Test01Person p = new Test01Person();
		System.out.println(p.sid);
		System.out.println(p.name);
		System.out.println(p.fm);
		System.out.println(p.address);
		p.ppp();
		
		Test01Student st = new Test01Student();
		System.out.println(st.sid);
		System.out.println(st.name);
		System.out.println(st.fm);
		System.out.println(st.address);
		System.out.println(st.kor);
		st.ppp();
		st.sss();
		
		Test01MiddleStudent mst = new Test01MiddleStudent();
		System.out.println(mst.sid);
		System.out.println(mst.name);
		System.out.println(mst.fm);
		System.out.println(mst.address);
		System.out.println(mst.kor);
		System.out.println(mst.eng);
		System.out.println(mst.math);
		System.out.println(mst.total);
		System.out.println(mst.avg);
		System.out.println(mst.grade);
		System.out.println(mst.java);
		mst.ppp();
		mst.sss();
		
		Test01Person.ppp3();
		Test01Student.ppp3();
		Test01MiddleStudent.ppp3();
		
		//오버로딩
		//클래스 내부에서 메소드와 생성자의 이름을 같도록 생성하고자할때
		//매개변수의 타입,개수,순서를 다르게 만드는것.
		
		//오버라이딩
		//상속이 전제로되어질때 슈퍼클래스의
		//메소드를 재정의 하는것
		
		//다형성을 이용한 객체생성
		//상속이 전제로 되어진때
		//슈퍼클래스타입 객체생성시 서브클래스생성자로 객체생성가능
		//이때 슈퍼클래스의 자원(속성,메소드 등)만 사용가능
		
	}

}
