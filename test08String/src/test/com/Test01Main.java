package test.com;

public class Test01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String...");
		
		String str = "kiMsss";
		System.out.println(str.equals("Kim"));
		System.out.println(str.equalsIgnoreCase("Kim"));
		System.out.println(str.compareTo("kiM"));
		System.out.println(str.compareTo("kiM")==0);
		
		String str2 = "Hello java";
		System.out.println(str2.startsWith("Hel"));
		System.out.println(str2.endsWith("va"));
		str2 = "http://www.java.com/aaa/bbb/test.jpg";
		System.out.println(str2.startsWith("http://"));
		System.out.println(str2.endsWith(".jpg"));
		
		str2 = "무궁화 꽃이 피었습니다.";
		System.out.println(str2.charAt(0));
		System.out.println(str2.charAt(5));
		System.out.println(str2.indexOf("무"));
		System.out.println(str2.indexOf("궁"));
		System.out.println(str2.indexOf(" "));
		System.out.println(str2.indexOf("."));
		System.out.println(str2.substring(5));
		System.out.println(str2.substring(5,8));
		System.out.println(str2.concat("<<<<"));
		str2 = str2.concat("<<<<");
		System.out.println(str2);
		str2 += "aaaa";
		System.out.println(str2);
		
		str2 = "A";
		System.out.println(str2.hashCode());
		str2 = "http://aaa.com/test.png";
		System.out.println(str2.lastIndexOf("/"));
		System.out.println(str2.substring(str2.lastIndexOf("/")));
		System.out.println(str2.length());
		System.out.println(str2.replace('a', 'b'));
		System.out.println(str2.replace("test","java"));
		System.out.println(str2.toCharArray());
		for (char x : str2.toCharArray()) {
			System.out.println(x);
		}
		String tmp = new String(str2.toCharArray());
		System.out.println(tmp);
		
		int x = 99;
		System.out.println(String.valueOf(x));
		Integer x2 = x;
		System.out.println(x2.toString());
		
		
		CharSequence st = "aaa";
		System.out.println(st.length());
	}

}
