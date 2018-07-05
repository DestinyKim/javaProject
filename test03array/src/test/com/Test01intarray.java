package test.com;

public class Test01intarray {

	public static void main(String[] args) {
		System.out.println("int array");
		

		//동일한 타입의 데이터를 하나의 타입으로 만들자.
		//[]
		//10,20,30
		int[] sus = new int[3];
//		sus[0] = 10;
//		sus[1] = 20;
//		sus[2] = 30;
		for (int i = 0; i < sus.length; i++) {
			sus[i] = 10*(i+1);
		}
		//System.out.println(sus[0]);
		//System.out.println(sus[1]);
		//System.out.println(sus[2]);
		for (int i = 0; i < sus.length; i++) {
			System.out.println(sus[i]);
		}
		
//		for (int su : sus) {
//			System.out.println(su);
//		}
		
//		int[] scores = {11,22,33,44,55};
		int[] scores = new int[]{11,22,33,44,55};
		System.out.println(scores.length);
		
		
	}

}
