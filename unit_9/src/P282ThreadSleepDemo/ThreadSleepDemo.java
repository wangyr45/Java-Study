package P282ThreadSleepDemo;
//�߳�����
class MyThread implements Runnable{
	public void run() {
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(Thread.currentThread().getName()
						+ "���У�i=" + i);
			}
		}
	}
}
public class ThreadSleepDemo {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		new Thread(mt,"�߳�").start();
	}
}
