package P197PolDemo;
class A5{	//������A
	public void fun1() {	//����fun1()����
		System.out.println("A --> public void fun1(){}");
	}
	public void fun2() {	//����fun2()����
		this.fun1();
	}
}
class B5 extends A5{			//����ͨ��extends�̳и���
	public void fun1() {	//���Ǹ����е�fun1()����
		System.out.println("B --> public void fun1(){}");
	}
	public void fun3() {	//�����Լ�����ķ���
		System.out.println("B --> public voidd fun3(){}");
	}
}
class C5 extends A5{		//����ͨ��extends�̳и���
	public void fun1() {	//���าд�����е�fun1()����
		System.out.println("C --> public void fun1(){}");
	}
	public void fun5() {	//�����Լ�����ķ���
		System.out.println("C --> public void fun3(){}");
	}
}
public class PolDemo05 {
	public static void main(String[] args) {
		fun(new B5());	//����B��ʵ������������ת��
		fun(new C5());	//����C��ʵ������������ת��
	}
	public static void fun(A5 a) {//���ܸ������
		a.fun1();
	}
}
