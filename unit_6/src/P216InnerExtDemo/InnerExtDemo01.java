package P216InnerExtDemo;
abstract class A{					//���������
	public abstract void printA();	//������󷽷�
	interface B{					//�����ڲ��ӿ�
		public void printB();		//������󷽷�
	}
}
class X extends A{					//�̳г�����
	public void printA() {			//ʵ�ֳ��󷽷�
		System.out.println("Hello -- > A");
	}
	class Y implements B{			//�����ڲ���ʵ���ڲ��ӿ�
		public void printB() {		//ʵ���ڲ��ӿڵĳ��󷽷�
			System.out.println("Hello -- > B");
		}
	}
}
public class InnerExtDemo01 {
	public static void main(String[] args) {
		A.B b = new X().new Y();	//ʵ�����ڲ��ӿڶ���
		b.printB();					//�����ڲ��ӿڵĳ��󷽷�
	}
}
