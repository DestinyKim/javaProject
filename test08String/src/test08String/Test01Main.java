package test08String;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Test01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String...");

		String str = "kiMsss";
		System.out.println(str.equals("Kim"));
		System.out.println(str.equalsIgnoreCase("Kim")); // 대소문자 구분하지 않고 알파벳만 맞는지 확인
		System.out.println(str.compareTo("kiM") == 0);// 같냐 다르냐

		String str2 = "Hello java";
		System.out.println(str2.startsWith("Hel")); // ""단어로 시작하냐
		System.out.println(str2.endsWith("va"));// "" 단어로 끝나냐
		str2 = "http://www.java.com/aaa/bbb/test.jpg";
		System.out.println(str.startsWith("http://"));
		System.out.println(str.endsWith(".jpg"));

		str2 = "무궁화 꽃이 피었습니다.";
		System.out.println(str2.charAt(0));// 몇번째 글짜냐 물음. (한글자씩이기 때문에 타입이 char)
		System.out.println(str2.charAt(5));
		System.out.println(str2.indexOf("무"));// 해당 글짜가 몇번째냐
		System.out.println(str2.indexOf("궁"));
		System.out.println(str2.indexOf("."));
		System.out.println(str2.indexOf(" "));
		System.out.println(str2.substring(5));// 5번인덱스부터 잘라.
		System.out.println(str2.substring(5, 6));// 5번인덱스부터 6번까지 잘라.
		System.out.println(str2.substring(5, 8));// 5번인덱스부터 8번까지 잘라.
		System.out.println(str2.concat("<<<"));
		str2 = str2.concat("<<<");

		str2 += "aaa";
		System.out.println(str2);

		str2 = "A";
		System.out.println(str2.hashCode());// ""해당 문자를 문자값으로 변환
		str2 = "http://aaa.com/test/png";
		System.out.println(str2.lastIndexOf("/"));
		System.out.println(str2.substring(str2.lastIndexOf("/")));
		System.out.println(str2.replace('a', 'b'));
		System.out.println(str2.replace("test", "java"));
		System.out.println(str2.toCharArray());
		for (char x : str2.toCharArray()) {
			System.out.println(x);
		}
		String tmp = new String(str2.toCharArray());
		System.out.println(tmp);

		int x = 99;
		System.out.println(String.valueOf(99));
		Integer x2 = x;// 스트링으로 바꿔서 반환해줘.
		System.out.println(String.valueOf(x2.toString()));

		CharSequence st = "aaa";
		System.out.println(st.length());// 배열의 렝쓰는 멤버필드이기때문에 괄호x.

	}

}
