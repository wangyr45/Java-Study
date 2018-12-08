package P290SyncDemo;
class MyThread implements Runnable{
	private int ticket = 5;
	public void run() {
		for(int i = 0; i < 100;i++) {
			if(ticket>0) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("ÂôÆ±£ºticket = " + ticket--);
			}
		}
	}
};
public class SyncDemo01 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		Thread t3 = new Thread(mt);
		t1.start();
		t2.start();
		t3.start();
		
	}
}
