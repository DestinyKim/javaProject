package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test07mission {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;// 입력처리함수
		;// .을 찍으면 안될때는 초기화일 때
		InputStreamReader isr = new InputStreamReader(is);// 입력처리함수
		BufferedReader br = new BufferedReader(isr);// 입력처리함수

		System.out.println("mission 7");

		// 학생제한수가 없는 성적프로그램만들기
		// 종료시 x로 그만하도록 코딩
		String students = "";
		String x = "";
		do {
			System.out.println("번호를 입력하세요");
			String num = br.readLine();
			// System.out.println(num);

			System.out.println("이름을 입력하세요");
			String name = br.readLine();
			// System.out.println(name);

			System.out.println("국어점수를 입력하세요");
			String kor = br.readLine();
			// System.out.println(kor);

			System.out.println("수학점수를 입력하세요");
			String math = br.readLine();
			// System.out.println(math);

			System.out.println("영어점수를 입력하세요");
			String eng = br.readLine();
			// System.out.println(eng);

			int total = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math);
			// System.out.println(total);

			double avg = (double) total / 3;
			// System.out.println(avg);

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
			// System.out.println(grade);
			students += "" + num + " " + name + " " + kor + " " + eng + " " + math + "" + total + " " + avg + " "
					+ grade + "\n";
			
			System.out.println("종료시 x");
			x = br.readLine();
		} while (!x.equals("x"));
		System.out.println("end main");
		// 번호,이름,국,영,수는 시스템입력처리

		// 반복문 종료 후 아래처럼 출력
		// 1 홍길동 90 90 90 270 90.0 A
		// 45 홍길동 80 80 80 240 80.0 B
		// 23 홍길동 40 40 40 120 40.0 과락

		System.out.println(students); // 로컬 밖에 있는걸 안에서 쓰는걸 괜찮아, 그치만 안에 있는걸 밖에서 쓰는건 안돼
	}// end main

}// end class
