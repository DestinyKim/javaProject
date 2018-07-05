package test.com;

public class Test04mession {

	public static void main(String[] args) {
		System.out.println("mession");

		//성적처리 프로그램
		System.out.println("성적처리 프로그램");
		//국어,영어,수학 점수를 담는 변수를 만들고
		int kor=0,eng=0,math=0;
		
		//국어 영어 수학 합계점수를 담는 변수를 만들고
		int total = 0;
		
		//과목평균점수를 담는 변수를 만들고
		double avg = 0.0;
		
		//국어 영어 수학 점수를 임의의 값을 할당
		kor=70;
		eng=70;
		math=0;
		//과목별 점수와 총점 평균을 출력하는 프로그램작성
		System.out.println("kor:"+kor);
		System.out.println("eng:"+eng);
		System.out.println("math:"+math);
		total = kor+eng+math;
		System.out.println("total:"+total);
		//avg = total/3.0;
		avg = (double)total/3;
		System.out.println("avg:"+avg);
		
		//학점(예:A,B,C,과락)을 담는 변수를 만들고
		String grade = 
				avg <= 100 && avg >= 90 ? "A":
					avg <= 89 && avg >= 80?"B":
						avg <= 79 && avg >= 70?"C":"과락";
		//평균점수에따른 학점을 출력하세요
		//100~90:A
		//80~89:B
		//...
		System.out.println(grade);
		
	}

}
