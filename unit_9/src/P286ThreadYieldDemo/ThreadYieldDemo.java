package P286ThreadYieldDemo;

//�߳�����

class MyThread implements Runnable{
	public void run() {
		for(int i = 0;i < 5;i++) {
			System.out.println(Thread.currentThread().getName()
					+ "���� --> " + i);
			if(i==3) {
				System.out.println("�߳����ã�");
				Thread.currentThread().yield();
			}
		}
	}
}
public class ThreadYieldDemo {	
	public static void main(String[] args) {
		MyThread my = new MyThread();
		Thread t1 = new Thread(my,"�߳�A");
		Thread t2 = new Thread(my,"�߳�B");
		t1.start();
		t2.start();
	}
}
