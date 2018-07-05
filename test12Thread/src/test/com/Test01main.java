package test.com;

public class Test01main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start Thread~~Runnable");
			
		
		
		//1.Thread 이너클래스로 thread로 돌리는 것
//		Theread t = new Thread() {
//			@Override
//			public void run() {
//				for (int i = 0; i < 10; i++) {
//					System.out.println("run"+i);
//				}
//			}
//		};
//		t. start();
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("run"+i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		
		//2.extends Thread
		Test01ThreadEx tex = new Test01ThreadEx();
		tex.start();
		
		
		//3.implements Runnable
		
		new Thread(new Test01Runnableimpl()).start();
		
		System.out.println("end Thread~~Runnable");
		
		//Thread 처리 3가지 방법을 이용하여
		//1. 알파벳을 찍으면서,
		//2. 30부터 39찍으면서,
		//3. 초단위 현재시간을 10초간 찍으세요.
	}

}
