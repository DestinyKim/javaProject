package test.com;

public class Test05Phone {

	String modelName;
	int price;
	String os;

	public Test05Phone(String modelName2, int price2, 
			String os2) {
		modelName = modelName2;
		price = price2;
		os = os2;
	}

	public Test05Phone() {
	}

	public static void main(String[] args) {
		Test05Phone p = new Test05Phone();
		System.out.println(p.modelName);
		System.out.println(p.os);
		System.out.println(p.price);

		// 임의의 값을 설정하여
		String modelName = "ss";
		int price = 8000;
		String os = "android";

		// 폰속성을 변경하고 출력하세요
		// 1.객체생성할때
		Test05Phone p1 = new Test05Phone(modelName, price, os);
		System.out.println(p1.modelName);
		System.out.println(p1.price);
		System.out.println(p1.os);
		
		// 2.객체생성후에
		Test05Phone p2 = new Test05Phone();
		p2.modelName = "lg";
		p2.price = 8000;
		p2.os = "ios";
		System.out.println(p2.modelName);
		System.out.println(p2.price);
		System.out.println(p2.os);
		
		
		// 3.제품클래스를 만들고
		Test06Product tp = new Test06Product();
		// 기존마우스정보와 기존폰정보를 속성으로 지정
		// 제품객체를 생성후 이를 통해
		// 마우스 정보와 폰정보를 출력
		System.out.println(tp);
		System.out.println(tp.mouse.pNum);
		System.out.println(tp.mouse.color);
		System.out.println(tp.mouse.country);
		System.out.println(tp.mouse.isWheel);
		System.out.println(tp.mouse.isLen);
		
		System.out.println(tp.phone.modelName);
		System.out.println(tp.phone.price);
		System.out.println(tp.phone.os);
		

	}

}
