package test.com;

public class Test01ifelse {

	public static void main(String[] args) {
		System.out.println("if~else");
		// 삼항연산자처럼 조건식에 의하여 실행문을 선택하고싶을때
		if (true) {
			System.out.println("true1");
			System.out.println("true2");
			System.out.println("true3");
			System.out.println("true4");
			System.out.println("true5");
		}

		if (5 == 5) {
			System.out.println("5==5");
		}

		if (5 > 0) {
			System.out.println("5>0");
		}

		if (5 != 4 && 5 < 0) {
			System.out.println("5!=4 && 5>0");
		}

		if (!"lee".equals("kim")) {
			System.out.println("ok");
		}

		int su = 3;
		if (su > 3) {
			System.out.println(su + ">3");
		} else {
			System.out.println("NO");
		}

		int score = 99;
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("과락");
		}
		
		//5600,5700 버스 탑승 프로그램(if문사용)
		String busNum = "5600";
		if (busNum.equals("5600") || busNum.equals("5700")) {
			System.out.println("탑승");
		}else {
			System.out.println("안탑승");
		}

		
		if (busNum.equals("5600")) {
			System.out.println("탑승");
		}else if (busNum.equals("5700")) {
			System.out.println("탑승");
		}else {
			System.out.println("안탑승");
		}
	}// end main()

}// end class
