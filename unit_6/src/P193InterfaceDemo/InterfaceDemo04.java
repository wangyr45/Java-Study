package P193InterfaceDemo;

interface A4{
	public String AUTHOR = "С��";//����ȫ�ֱ���
	public void print();		//������󷽷�
	public String getInfo();	//������󷽷�
}
abstract class B4{				//���������B
	public abstract void say();
}
class X4 extends B4 implements A{	//����ͬʱʵ�ֽӿ�
	public void say() {	//��д������B�еĳ��󷽷�
		System.out.println("hello world!");
	}
	public String getInfo() {	//��д�ӿ�A�еĳ��󷽷�
		return "HELLO";
	}
	public void print() {	//��д�ӿ�A�еĳ��󷽷�
		System.out.println("���ߣ�" + AUTHOR);
	}
}
public class InterfaceDemo04 {
	public static void main(String[] args) {
		X4 x = new X4();
		x.say();
		x.print();
	}
}
