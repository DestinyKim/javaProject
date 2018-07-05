package test.com;

public class Test03Operator2 {

	public static void main(String[] args) {
		System.out.println("Operator2");

		// 1. . ()

		// 2. 산술 + - * / %
		System.out.println(10 + 3);
		System.out.println(10 - 3);
		System.out.println(10 * 3);
		System.out.println(10 / 3);
		System.out.println(10 % 3);

		System.out.println(10.0f / 3);
		System.out.println(10.0 / 3);

		// 3. 대입,할당 = += -= *= /= %= &= |= ^=
		int su = 10;
		System.out.println(su);
		su += 3;// su = su +3;
		System.out.println(su);// 13
		su -= 5;// su = su -5;
		System.out.println(su);
		System.out.println();
		// 4.bit연산 & | ^
		System.out.println(2 & 8);
		System.out.println(2 | 8);
		System.out.println(4 ^ 8);

		int su2 = 4;
		System.out.println(su2);
		su2 &= 8;
		System.out.println(su2);
		su2 |= 8;
		System.out.println(su2);
		su2 ^= 1;
		System.out.println(su2);

		// 5. 논리연산 참,거짓 false,true & && | ||
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(true ^ false);
		System.out.println(true | false);

		// 6.비교연산 == != > < >= <= 결과는 참거짓
		int aaa = 55;
		int bbb = 5;
		System.out.println(aaa == bbb);
		System.out.println(aaa != bbb);

		// 7.비교논리 연합군
		System.out.println(aaa == bbb & aaa != bbb);
		System.out.println(aaa == bbb && aaa != bbb);
		System.out.println(aaa == bbb | aaa != bbb);
		System.out.println(aaa == bbb || aaa != bbb);

		// 8.쉬프트 >> << >>>
		System.out.println(8 >> 2);// 0010
		System.out.println(2 << 2);// 1000
		System.out.println((byte) -8 >>> 2);

		// 9.삼항연산자 : 결과가 참거짓boolean ? 참일때 : 거짓일때
		System.out.println(false ? "김" : "박");
		System.out.println(true & false ? 100 : 0);
		System.out.println( aaa==bbb  ? 22.0 : 99.0 );
		System.out.println( aaa==bbb | aaa!=bbb ? false : true);

		boolean bool = true;
		bool = aaa==bbb | aaa!=bbb;
		String name = bool ? "김" : "박";
		System.out.println(name);
		
		bool = false;
		//1000
		//0011
		name = bool ? "김" : ((3+5)&3)<3? "lee": 3==3 ? "kim": "other";
		System.out.println(name);
		
		
		//10. ++ -- 증감연산자
		int a = 10;
		a++;//a + 1
		++a;//a + 1
		--a;//a - 1 
		a--;
		System.out.println(a);
		
		int x = 10;
		int y = x--;
		System.out.println(x);
		System.out.println(y);
		
		
	}// end main()

}// end class
