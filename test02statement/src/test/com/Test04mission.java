package test.com;

public class Test04mission {

	public static void main(String[] args) {
		System.out.println("mission...");

		// 1. 3명의 학생의 성적을 처리하는 프로그램
		// 번호,이름,국,영,수,총점,평균,등급
		// 1 홍길동1 91 81 71 243 81 B
		// 2 홍길동2 92 82 72 246 82 B
		// 3 홍길동3 93 83 73 249 83 B
		for (int i = 1; i <= 3; i++) {
			String name = "asd";
			int kor = 90;
			int eng = 80;
			int mat = 70;

			kor = kor + i;
			eng = eng + i;
			mat = mat + i;

			int total = kor + eng + mat;
			double avg = total / 3.0;
			String grade;
			switch ((int) avg / 10) {
			case 10:
			case 9:
				grade = "A";
				break;

			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			default:
				grade = "과락";
				break;
			}

			System.out.println(
					i + " " + name + i + " " + kor + " " + eng + " " + mat + " " + total + " " + avg + " " + grade);

		}

		// 2. 구구단을 출력하세요
		for (int i = 2; i < 10; i++) {
			for (int k = 1; k < 10; k++) {
				System.out.print(i + "*" + k + "=" + (i * k)+" ");
			}
			System.out.println();

		}

	}// end main()

}// end class
