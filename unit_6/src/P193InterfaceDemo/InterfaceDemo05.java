package P193InterfaceDemo;

interface A5{//����ӿ�A
	public String AUTHOR = "С��";//����ȫ�ֱ���
	public void print();	//������󷽷�
	public String getInfo();//������󷽷�
}
abstract class B5 implements A5{//��������࣬ʵ�ֽӿ�
	public abstract void say();	//��ʱ�������д���3�����󷽷�
}
class X5 extends B5{	//����̳г�����
	public void say() {	//��д������B�еĳ��󷽷�
		System.out.println("Hello World!");
	}
	public String getInfo() {	//��д������B�еĳ��󷽷�
		return "Hello";
	}
	public void print() {	//��д������B�еĳ��󷽷�
		System.out.println("���ߣ�" + AUTHOR);
	}
}
public class InterfaceDemo05 {
	public static void main(String[] args) {
		X5 x = new X5();
		x.say();
		x.print();
	}
}
