package P205InterfaceCaseDemo;

interface A{	//����ӿ�A
	public abstract void print();	//������󷽷�print()
}
class B implements A{	//����ʵ�ֽӿ�
	public void print() {
		System.out.println("Hello World!!!");
	}
}
public class InterfaceCaseDemo01 {
	public static void main(String[] args) {
		A a = new B();
		a.print();
	}
}
