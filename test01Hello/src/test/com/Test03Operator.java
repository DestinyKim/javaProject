package test.com;

public class Test03Operator {

	public static void main(String[] args) {
		String name = "yang";
		System.out.println("Operator "+name+" 연산자");
		
		//. 연산자 >> 좌측거안에 우측거 있어
		byte b = -127;
		System.out.println(b);
		
		Byte b2 = 0;
		System.out.println(b2);
		System.out.println(b2.MIN_VALUE+"~"+b2.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);

		
		Short s1 = 0;
		System.out.println(s1.MIN_VALUE+"~"+s1.MAX_VALUE);
		System.out.println(Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		
		Integer su = 0;
		System.out.println(su.MIN_VALUE+"~"+su.MAX_VALUE);
		
		Character c1 = 0;
		System.out.println(c1.MIN_VALUE+"~"+c1.MAX_VALUE);
		//타입변환연산자(),캐스팅
		System.out.println((int)c1.MIN_VALUE+"~"+(int)c1.MAX_VALUE);
		System.out.println((int)Character.MIN_VALUE+"~"+(int)Character.MAX_VALUE);
		
		Long lon = 0L;
		System.out.println(lon.MIN_VALUE+"~"+lon.MAX_VALUE);
		System.out.println(Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		
		Float f = 3.14f;
		System.out.println(f.MIN_VALUE+"~"+f.MAX_VALUE);
		System.out.println(Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		
		Double d = 3.14;
		System.out.println(d.MIN_VALUE+"~"+d.MAX_VALUE);
		System.out.println(Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		
		
		byte b3 = (byte)128;
		System.out.println(b3);
		
	}

}
