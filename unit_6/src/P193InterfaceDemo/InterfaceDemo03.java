package P193InterfaceDemo;

interface A{						//����ӿ�A
	public String AUTHOR = "С��";	//����ȫ�ֳ���
	public void print();			//������󷽷�
	public String getInfo();		//������󷽷�
}
interface B{			//����ӿ�B
	public void say();	//������󷽷�
}
class X implements A,B{			//����ͬ��ʵ�������ӿ�
	public void say() {			//��дB�ӿ��еĳ��󷽷�
		System.out.println("Hello World!!!");
	}
	public String getInfo() {	//��дA�ӿ��еĳ��󷽷�
		return "Hello";
	}
	public void print() {		//��дA�ӿ��еĳ��󷽷�
		System.out.println("���ߣ�" + AUTHOR);
	}
}
public class InterfaceDemo03 {
	public static void main(String[] args) {
		X x = new X();	//ʵ�����������
		x.say();		//���ñ���д���ķ���
		x.print();		//���ñ���д���ķ���
	}
}
