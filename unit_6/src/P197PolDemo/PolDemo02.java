package P197PolDemo;

class A2{	//������A
	public void fun1() {	//����fun1()����
		System.out.println("A --> public void fun1(){}");
	}
	public void fun2() {	//����fun2()����
		this.fun1();
	}
}
class B2 extends A2{			//����ͨ��extends�̳и���
	public void fun1() {	//���Ǹ����е�fun1()����
		System.out.println("B --> public void fun1(){}");
	}
	public void fun3() {	//�����Լ�����ķ���
		System.out.println("B --> public voidd fun3(){}");
	}
}
public class PolDemo02 {
	public static void main(String[] args) {
		A2 a = new B2();	//����������ת�͵Ĺ�ϵ������ --> ����
		B2 b = (B2)a;		//��ʱ����������ת�͹�ϵ
		b.fun1();		//���÷�������д�ķ���
		b.fun2();		//���ø���ķ���
		b.fun3();		//���������Լ�����ķ���
	}
}
