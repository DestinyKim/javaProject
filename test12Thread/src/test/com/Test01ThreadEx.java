package test.com;

public class Test01ThreadEx extends Thread {
	
	@Override
	public void run() {
		for (int i = 10; i < 20; i++) {
			System.out.println("run"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
