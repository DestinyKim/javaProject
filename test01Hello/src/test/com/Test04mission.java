package test.com;

public class Test04mission {

	public static void main(String[] args) {
		System.out.println("mission");

		// 성적처리 프로그램
		System.out.println("성적처리 프로그램");
		// 국어, 영어, 수학 점수를 담는 변수를 만들고(변수는 첫글자 소문자)
		int kor=0;//[int kor=0, eng=0, math=0;] 로 바꿀 수도 있음. ","는 연결연산자
		int eng=0;
		int math=0; 
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		// 국어, 영어, 수학 합계점수를 담는 변수를 만들고
		int total = 0;
		System.out.println(total);
		// 과목평균점수를 담는 변수를 만들고
		double avg= 0.0;
		System.out.println(avg);
		// 국어 영어 수학 점수를 임의의 값을 할당
		kor=90; 
		eng=80; 
		math=99;
		// 과목벼 점수와 총점 평균을 출력하는 프로그램을 작성
		System.out.println("kor:"+kor);
		System.out.println("eng:"+eng);
		System.out.println("math:"+math);
		total = kor+eng+math;
		System.out.println("total:"+total);
		//avg = total/3.0
		avg = (double)total/3;
		System.out.println("avg:"+avg);	
		//======================================================
		
		//학점(예:A,B,C...)을 담는 변수를 만들고,
		String grade = 
				avg <= 100 && avg >= 90 ? "A": 
					avg >= 80?"B":
						 avg >= 70?"C":"FAIL";
		//평균점수에따른 학점을 출력하세요.
		//100~90:A
		//80~89:B
		//...

	System.out.println(grade);
			
	}

}
