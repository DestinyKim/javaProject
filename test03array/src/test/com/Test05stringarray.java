package test.com;

public class Test05stringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String array");
		
		
		String[] strs = new String[3];
		strs[0] = "kim";
		strs[1] = "yangssem";
		strs[2] = "choi";
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		
		for (String str : strs) {
			System.out.println(str);
		}
		
		
		String[] names = new String[] {"aaa","vvv","rrr"};
		
	}

}
