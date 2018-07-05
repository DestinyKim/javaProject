package test.com;

public class Test02main {
	public static void main(String[] args) {
		System.out.println("mission");
		System.out.println("Thread Start");

		new Thread() {
			public void run() {
				for (char i = 'a'; i < 'z'; i++) {
					System.out.println('i'+i);

				}
			}
		}.start();

		Thread t = new Thread() {
			public void run() {
				for (int i = 30; i < 40; i++) {
					System.out.println("run" + i);
				}
			}
		};
		t.start();
	}
}