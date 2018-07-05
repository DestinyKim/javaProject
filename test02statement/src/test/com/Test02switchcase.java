package test.com;

public class Test02switchcase {

	public static void main(String[] args) {
		System.out.println("switch~case");
		String name = "kim";
		switch (name) {
		case "kim":
			System.out.println("ok1");
			break;
		case "lee":
			System.out.println("ok2");
			break;
		default:
			System.out.println("other");
			break;
		}
		
		int num = 7;
		switch (num) {
		case 10:
			System.out.println("수");
			break;
		case 9:
			System.out.println("우");
			break;
		case 8:
			System.out.println("미");
			break;
		case 7:
			System.out.println("양");
			break;
		default:
			System.out.println("가");
			break;
		}
		
		//성적처리프로그램switch case를 사용해서 만드세요
		//국,영,수,총점,평균,등급
		//A,B,C,과락
		int kor = 100;
		int eng =99;
		int math =100;
		int total = kor+eng+math;
		double avg = total/3.0;
		System.out.println("total:"+total);
		System.out.println("avg:"+avg);
		System.out.println("avg:"+(int)avg);
		String grade = null;
		System.out.println(grade);
		switch ((int)avg/10) {
		case 10:
		case 9:
			//System.out.println("A");
			grade = "A";
			break;
		case 8:
			//System.out.println("B");
			grade = "B";
			break;
		case 7:
			//System.out.println("C");
			grade = "C";
			break;
		default:
			//System.out.println("과락");
			grade = "과락";
			break;
		}
		System.out.println(grade);
		
		
	}

}
