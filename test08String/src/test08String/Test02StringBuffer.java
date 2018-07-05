package test08String;

public class Test02StringBuffer {

	public static void main(String[] args) {
		System.out.println("StringBuffer StringBuilder");// 대용량 문자처리

		StringBuffer sb = new StringBuffer();
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		sb.append("aaaa");
		System.out.println(sb.toString());

		StringBuilder sb2 = new StringBuilder();
		sb2.append("bbbb");
		sb2.append("bbbb");
		sb2.append("bbbb");
		sb2.append("bbbb");
		sb2.append("bbbb");
		sb2.append("bbbb");
		System.out.println(sb2.toString());

		/* Test02StringBuffer. */
//		printRunTime1(); 5~6초
//		printRunTime2();
		printRunTime3();
		

	}

	public static void printRunTime1() {

		long startTime = System.currentTimeMillis();
		String s = "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			s += "ssss";
		}

		System.out.println(System.currentTimeMillis() - startTime);
	}
	public static void printRunTime3() {

		long startTime = System.currentTimeMillis();
		String s = "";
		
		for (int i = 0; i < 100000; i++) {
			s = s.concat("ssss");
		}

		System.out.println(System.currentTimeMillis() - startTime);
	}

}
