package P288ExecDemo;
//实现一：继承Thread类
class MyThread extends Thread{
	private int time;
	public MyThread(String name,int time) {
		super(name);
		this.time = time;
	}
	public void run() {
		try {
			Thread.sleep(this.time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()
				+ "线程，休眠" + this.time + "毫秒。");
	}
}
public class ExecDemo01 {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("线程A",10000);
		MyThread mt2 = new MyThread("线程B",10000);
		MyThread mt3 = new MyThread("线程C",10000);
		mt1.start();
		mt2.start();
		mt3.start();
		
	}
}
