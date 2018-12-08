package P290SyncDemo;

class MyThread03 implements Runnable{
	private int ticket = 5;
	public void run() {
		for(int i = 0; i < 100;i++) {
			this.sale();
		}
	}
	public synchronized void sale() {
		if(ticket>0) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("ÂôÆ±£ºticket = "
					+ ticket--);
		}
	}
};
public class SyncDemo03 {
	public static void main(String[] args) {
		MyThread03 mt = new MyThread03();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		Thread t3 = new Thread(mt);
		t1.start();
		t2.start();
		t3.start();
		
	}
}
