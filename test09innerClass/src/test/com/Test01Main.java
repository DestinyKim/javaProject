package test.com;

import test.com.MemberOut.Inner;

public class Test01Main {
	
	public void aaa() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inner class");
		
		//1.member inner
		Inner in = new MemberOut().new Inner();
		in.test();
		
		//2.static inner
		System.out.println(test.com.StaticOut.Inner.name);
		test.com.StaticOut.Inner.kkk();
		test.com.StaticOut.Inner sin = new StaticOut.Inner();
		System.out.println(sin.id);
		
		//3.local inner
		LocalOut lout = new LocalOut();
		lout.test();
		
		
		//4.annonymous inner
//		Test01Main tm = new Test01Main() {
//			@Override
//			public void aaa() {
//				// TODO Auto-generated method stub
//				super.aaa();
//			}
//		};
//		Test01AAA ta = new Test01AAA();
//		ta.test(new Test01Main() {
//			@Override
//			public void aaa() {
//				System.out.println("aaa().....");
//			}
//		});
		
	}
	Test01Main tm = new Test01Main() {
		@Override
		public void aaa() {
			// TODO Auto-generated method stub
			super.aaa();
		}
	};
}
