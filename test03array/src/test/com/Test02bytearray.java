package test.com;

public class Test02bytearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("byte array");
		byte[] sus = new byte[5];
		sus[0] = 11;
		sus[1] = 33;
		sus[2] = 44;
		sus[3] = 66;
		sus[4] = 99;
		System.out.println(sus.length);
		for (int i = 0; i < sus.length; i++) {
			System.out.println(sus[i]);
		}
		
		for (byte b : sus) {
			System.out.println(b);
		}
		
		byte[] temp = new byte[] {11,22,33};
	}

}
