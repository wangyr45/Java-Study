package P267ThreadDemo;
class MyThread extends Thread{			//�̳�Thread��
	private String name;				//�����ж���һ������
	public MyThread(String name) {		//ͨ�����췽��������������
		this.name = name;
	}
	public void run() {					//��дThrad���е�run()����
		for(int i = 0; i < 10; i++) {	//ѭ��10�����
			System.out.println(name + "���У�i=" + i);
		}
	}
};

public class ThreadDemo01 {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("�߳�A");//ʵ��������
		MyThread mt2 = new MyThread("�߳�B");//ʵ��������
		mt1.run();							//�����߳�����
		mt2.run();							//�����߳�����
		/*mt1.start();		//�������߳�
		mt2.start();		//�������߳�
		*/
	}
}
