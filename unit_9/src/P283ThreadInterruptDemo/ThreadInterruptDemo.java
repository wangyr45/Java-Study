package P283ThreadInterruptDemo;
//�ж��߳�
class MyThread implements Runnable{
	public void run() {
		System.out.println("1������run����");
		try {
			Thread.sleep(10000);
			System.out.println("2���Ѿ��������");
		}catch(Exception e) {
			System.out.println("3�����߱���ֹ");
			return;
		}
		System.out.println("4��run������������");
	}
}
public class ThreadInterruptDemo {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt,"�߳�");
		t.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		t.interrupt();
	}
}
