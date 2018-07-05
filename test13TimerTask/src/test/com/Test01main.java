package test.com;

import java.util.Timer;
import java.util.TimerTask;

public class Test01main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start Timer TimerTask");

		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				System.out.println("run...");

			}
		};
	
		Timer t = new Timer();
		t.schedule(tt, 3000, 1000);
		System.out.println(t.purge());
		
		System.out.println("end Timer TimerTask");
	}

}
