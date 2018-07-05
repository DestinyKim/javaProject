package test.com;

public class Test02StringBuffer {

	public static void main(String[] args) {
		System.out.println("StringBuffer  StringBuilder");
		
		
		StringBuffer sb = new StringBuffer();
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
		
		/*Test02StringBuffer.*/
		//printRunTime1();5~6초
		//printRunTime2();//0.007초
		printRunTime3();//3초
	}
	
	public static void printRunTime1() {
		long startTime = System.currentTimeMillis();
		String s = "";
		for (int i = 0; i < 100000; i++) {
			s += "ssss";
		}
		System.out.println(System.currentTimeMillis()-startTime);
	}
	public static void printRunTime2() {
		long startTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			sb.append("ssss");
		}
		System.out.println(System.currentTimeMillis()-startTime);
	}
	public static void printRunTime3() {
		long startTime = System.currentTimeMillis();
		String s = "";
		for (int i = 0; i < 100000; i++) {
			s = s.concat("ssss");
		}
		System.out.println(System.currentTimeMillis()-startTime);
	}

}
