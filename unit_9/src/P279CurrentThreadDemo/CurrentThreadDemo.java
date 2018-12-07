package P279CurrentThreadDemo;

class MyThread implements Runnable{
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName()+"运行，i=" + i);
		}
	}
};
public class CurrentThreadDemo {
	public static void main(String[] args) {
		MyThread my = new MyThread();
		new Thread(my,"线程").start();
		my.run();
	}
}
