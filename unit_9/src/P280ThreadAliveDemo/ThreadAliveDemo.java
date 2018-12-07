package P280ThreadAliveDemo;
//判断线程是否启动
class MyThread implements Runnable{
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName()+"运行 -->" + i);
		}
	}
};
public class ThreadAliveDemo {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt,"线程");
		System.out.println("线程开始执行之前 --> " + t.isAlive());
		
		t.start();
		System.out.println("线程开始执行之后 --> " + t.isAlive());
		
		for(int i = 0; i < 3; i++) {
			System.out.println("main 运行 --> " + i);
		}
		System.out.println("代码执行之后 --> " + t.isAlive());
	}
}
