package P284ThreadDaemonDemo;
//��̨�߳�
class MyThread implements Runnable{
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName()+"�����С�");
			}
		}
};
public class ThreadDaemonDemo {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt,"�߳�");
		t.setDaemon(true);
		t.start();
	}
}
