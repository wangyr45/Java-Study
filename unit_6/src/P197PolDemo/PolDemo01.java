package P197PolDemo;
/*
 * ����Ķ�̬��
 * 1.�����������븲д
 * 2.����Ķ�̬��
 * 
 * ����ת��
 * 1.����ת�ͣ� ���� ������� = ����ʵ��
 * 2.����ת�ͣ����� ������� = �����ࣩ����ʵ��
 * */
class A{	//������A
	public void fun1() {	//����fun1()����
		System.out.println("A --> public void fun1(){}");
	}
	public void fun2() {	//����fun2()����
		this.fun1();
	}
}
class B extends A{			//����ͨ��extends�̳и���
	public void fun1() {	//���Ǹ����е�fun1()����
		System.out.println("B --> public void fun1(){}");
	}
	public void fun3() {	//�����Լ�����ķ���
		System.out.println("B --> public voidd fun3(){}");
	}
}
public class PolDemo01 {
	public static void main(String[] args) {
		B b = new B();	//��������ʵ��������
		A a = b;	//����������ת�͵Ĺ�ϵ������ --> ����
		a.fun1();	//�˷��������าд��
	}
}
