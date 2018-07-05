package test00Random;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		System.out.println("Random...Math..object");

		// 임의의 정수를 추출하고 싶을때 : Random
		// Random r = new Random();
		// int su = r.nextInt(10); //>>일반메소드
		// System.out.println("Random su:"+su);

		// // 임의의 난수를 추출하고 싶을때 : Math
		// double d = Math.random()*10; //>>스태틱메소드
		// System.out.println("Math d:"+(int)d);

		String[] names = new String[] { "김남은", "김윤성", "박이현", "신현명", "윤상훈", "이동준", "이세희", "장재광", "정은아", "조상묵", "진형기",
				"최준형", "한수진", "최태용", "곽찬양" };
		Random r = new Random();

		for (int i = 0; i < names.length; i++) {
			int su = r.nextInt(15); // >>일반메소드
			System.out.println("Random su:" + su);
			System.out.println("Random name:" + names[su]);
			if (i == names.length - 1) {
				System.out.println("=================");
				System.out.println("당첨:" + names[su]);
				System.out.println("=================");
			}
		}
	}
}
