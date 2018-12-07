package P272RunnableDemo;
class MyThread implements Runnable{		//ʵ��Runnable�ӿ�
	private String name;				//�����ж���һ������
	public MyThread(String name) {		//ͨ�����췽��������������
		this.name = name;				//Ϊname���Ը�ֵ
	}
	public void run() {					//��дRunnable�ӿ��е�run()����
		for(int i = 0; i < 10; i++) {
			System.out.println(name + "���У�i=" + i);
		}
	}
};
public class RunnableDemo01 {
	public static void main(String[] args) {
		MyThread my1 = new MyThread("�߳�A");//ʵ����Runnable�������
		MyThread my2 = new MyThread("�߳�B");//ʵ����Runnable�������
		Thread t1 = new Thread(my1);	//ʵ����Thread�����
		Thread t2 = new Thread(my2);	//ʵ����Thread�����
		t1.start();						//�����߳�
		t2.start();						//�����߳�
		
	}
}
