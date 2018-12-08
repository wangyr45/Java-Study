package P288ExecDemo;
//ʵ��һ���̳�Thread��
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
				+ "�̣߳�����" + this.time + "���롣");
	}
}
public class ExecDemo01 {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("�߳�A",10000);
		MyThread mt2 = new MyThread("�߳�B",10000);
		MyThread mt3 = new MyThread("�߳�C",10000);
		mt1.start();
		mt2.start();
		mt3.start();
		
	}
}
