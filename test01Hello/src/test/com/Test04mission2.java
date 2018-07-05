package test.com;

public class Test04mission2 {

	public static void main(String[] args) {
		System.out.println("mission2");

		// 비교연산 ==, !=
		// 문자열에 대한 비교 : equals
		String name = "kim";
		boolean bool = name.equals("kim");
		System.out.println(bool);

		String number = "1000";
		System.out.println(number.equals("10000"));
		System.out.println(!number.equals("10000"));// !는 참거짓일때만 부정할 수 있다.

		String price = null; // null값
		price = "999.88";// 실수타입-double
		// int intprice = Integer.parseInt(price);
		double dprice = Double.parseDouble(price);
		System.out.println(dprice);
		// 가격이 900원 이상이면 구입안함. - 정수를 비교해야함.
		System.out.println(dprice >= 900 ? "구입안함" : "구입");

		// 5600번 버스와 5700번 버스는 탑승.
		String busNumber = "5601";
		System.out.println(busNumber.equals("5600") || busNumber.equals("5700") ? "탑승" : "탑승안함");

		// 5600번에서 5700번 사이에 버스는 전부 탑승.
		System.out.println(
				Integer.parseInt(busNumber)>=5600 && Integer.parseInt(busNumber)<= 5700 ? "탑승" : "탑승안함");

	}// end main()

}// end class
