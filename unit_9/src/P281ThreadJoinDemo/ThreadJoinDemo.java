package P281ThreadJoinDemo;
//�̵߳�ǿ������
class MyThread implements Runnable{
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+"����-->" + i);
	
		}
	}
};
public class ThreadJoinDemo {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt,"�߳�");
		t.start();
		for(int i = 0; i < 50;i++) {
			if(i > 10) {
				try {
					t.join();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			System.out.println("Main �߳����� -->" + i);
		}
	}
}
