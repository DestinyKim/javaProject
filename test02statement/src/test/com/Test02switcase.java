package test.com;

public class Test02switcase {

	public static void main(String[] args) {
		System.out.println("swithch~case");
		String name = "lee";
		// key 에는 정수와 문자가 들어갈 수 있음.
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

		int num = 10;
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

		// 성적처리프로그램switch case를 사용해서 만드세요
		// 국,영,수,총점,평균,등급
		int kor = 55, eng = 80, mat = 57, tot = kor + eng + mat;
		double avg = (double) tot / 3;
		// A, B, C, 과락
		String grade ;
		switch ((int) avg / 10) {
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
			grade="과락";
			break;
					}
		System.out.println(grade);

	}
}
