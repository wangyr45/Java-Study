package P284ThreadDaemonDemo;
//后台线程
class MyThread implements Runnable{
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName()+"在运行。");
			}
		}
};
public class ThreadDaemonDemo {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt,"线程");
		t.setDaemon(true);
		t.start();
	}
}
