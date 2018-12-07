package P281ThreadJoinDemo;
//线程的强制运行
class MyThread implements Runnable{
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+"运行-->" + i);
	
		}
	}
};
public class ThreadJoinDemo {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt,"线程");
		t.start();
		for(int i = 0; i < 50;i++) {
			if(i > 10) {
				try {
					t.join();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			System.out.println("Main 线程运行 -->" + i);
		}
	}
}
