package P152SingleDemo;

class Singleton{
	static Singleton instance = new Singleton();//���ڲ����������ʵ��������
	private Singleton() {	//�˴������췽�����з�װ
		
	}
	public void pint() {
		System.out.println("Hello World!!");
	}
}
public class P152SingleDemo04 {
	public static void main(String[] args) {
		Singleton s1 = null;
		s1 = Singleton.instance;	//�������еľ�̬����
		s1.pint();
	}
}
