package test.com;

public class Test02Score {
	int kor;
	int eng;
	int math;
	
	//1.setKor : 국어성적을 받아서 멤버변수 국어에 저장하는 메소드
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	//2.getEng : 멤버변수의 저장된 영어점수를 반환하는 메소드
	public int getEng() {
		return eng;
	}
	
	//3.setMath : 수학성적을 받아서 멤버변수 수학에 저장하는 메소드
	public void setMath(int math) {
		this.math = math;
	}
	
	
	//4.setEng : 영어성적을 받아서 멤버변수 영어에 저장하는 메소드
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	//5.aaa5 : 멤버변수 국어,영어,수학 점수를 
	//			합계한 결과를 반환하는 메소드
	public int total() {
		return kor+eng+math;
	}
	
}
