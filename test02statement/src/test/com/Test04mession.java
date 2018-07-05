package test.com;

public class Test04mession {

	public static void main(String[] args) {
		System.out.println("mession...");

		// 1. 3명의 학생의 성적을 처리하는 프로그램
		// 번호,이름,국,영,수,총점,평균,등급
		// 1 홍길동1 91 81 71 243 81 B
		// 2 홍길동2 92 82 72 246 82 B
		// 3 홍길동3 93 83 73 249 83 B
		int manCount = 3;// 학생수

		for (int i = 0; i < manCount; i++) {
			int num = i + 1;
			String name = "홍길동";
			int kor = 90 + num;
			int eng = 80 + num;
			int math = 70 + num;
			int total = kor + eng + math;
			double avg = total / 3.0;
			String grade = null;
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
			System.out.println(num + " " + name + num + " " + kor + " " + eng + " " + math + " " + total + " " + avg
					+ " " + grade + "");
		}

		// 공자왈 \"하하하\"

		// 2.구구단을 출력하세요
		// 2*1=2 2*2=4...2*9=18
		// 3*1=3 3*2=6...3*9=27
		// ...
		// 9*1=9 9*2=18...9*9=81
		for (int x = 2; x < 10; x++) {
			for (int i = 1; i < 10; i++) {
				System.out.print(x + "*" + i + "=" + x * i + " ");
				if(i==4)break;
				
			}
			System.out.println();
			//if(x==4)break;
		}

	}

}
