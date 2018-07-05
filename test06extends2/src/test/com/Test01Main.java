package test.com;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("상속");

		Test01ClassA ca = new Test01ClassB();

		Test01ClassA ca2 = new Test01ClassA() {
			int x;

			public void xxx() {

			}
		};
		Test01ClassB cb = new Test01ClassB();
		Test01ClassA cb2 = new Test01ClassB();

		Test01InterCimpl ic = new Test01InterCimpl();
		Test01InterC ic2 = new Test01InterCimpl();
		Test01InterC ic3 = new Test01InterC() {
			@Override
			public int ccc(String x) {
				return 0;
			}
		};

		Test01AbsClass abs = new Test01AbsClass() {

			@Override
			public int abs() {
				// TODO Auto-generated method stub
				return 0;
			}
		
		};
		Test01AbsClass abs2 = new Test01AbsClassEx();
		
		Test01AbsClassEx absex = new Test01AbsClassEx();

	}

}
