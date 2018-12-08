package P286ThreadYieldDemo;

//线程礼让

class MyThread implements Runnable{
	public void run() {
		for(int i = 0;i < 5;i++) {
			System.out.println(Thread.currentThread().getName()
					+ "运行 --> " + i);
			if(i==3) {
				System.out.println("线程礼让：");
				Thread.currentThread().yield();
			}
		}
	}
}
public class ThreadYieldDemo {	
	public static void main(String[] args) {
		MyThread my = new MyThread();
		Thread t1 = new Thread(my,"线程A");
		Thread t2 = new Thread(my,"线程B");
		t1.start();
		t2.start();
	}
}
