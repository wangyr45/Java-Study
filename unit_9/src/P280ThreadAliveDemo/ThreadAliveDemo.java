package P280ThreadAliveDemo;
//�ж��߳��Ƿ�����
class MyThread implements Runnable{
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName()+"���� -->" + i);
		}
	}
};
public class ThreadAliveDemo {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt,"�߳�");
		System.out.println("�߳̿�ʼִ��֮ǰ --> " + t.isAlive());
		
		t.start();
		System.out.println("�߳̿�ʼִ��֮�� --> " + t.isAlive());
		
		for(int i = 0; i < 3; i++) {
			System.out.println("main ���� --> " + i);
		}
		System.out.println("����ִ��֮�� --> " + t.isAlive());
	}
}
