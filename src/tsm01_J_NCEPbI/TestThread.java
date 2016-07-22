package tsm01_J_NCEPbI;


public class TestThread implements Runnable {

	public void run() {
		Publisher test = new Publisher((int)(10.0*Math.random()) + 1);
	}
	public static void main(String[] args) throws Exception { 
		
		TestThread t = new TestThread();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}
}
