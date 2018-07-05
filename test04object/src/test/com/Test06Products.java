package test.com;

public class Test06Products {

	Test04Mouse m = new Test04Mouse();
	Test05Phone ph = new Test05Phone();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test06Products pro = new Test06Products();
		System.out.println(pro.m.pNum);
		System.out.println(pro.m.color);
		System.out.println(pro.m.country);
		System.out.println(pro.m.isWheel);
		System.out.println(pro.m.isLen);

		System.out.println(pro.ph.modelName);
		System.out.println(pro.ph.os);
		System.out.println(pro.ph.price);

	}

}
