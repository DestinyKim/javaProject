package test.com;

public interface Test03product {

	/*static final*/ String P_NAME = "HP001";
	
	//생성자선언 불가능
	//다형성을 이용하여 객체생성가능
	
//	public default void test() {
//		
//	}
//	public static void test2() {
//		
//	}
	public /*abstract*/ void test3() ;//선언만 되어진 메소드,추상메소드
	
	public int insert(String[] names);
}







