package P197PolDemo;
class A4{	//������A
	public void fun1() {	//����fun1()����
		System.out.println("A --> public void fun1(){}");
	}
	public void fun2() {	//����fun2()����
		this.fun1();
	}
}
class B4 extends A4{			//����ͨ��extends�̳и���
	public void fun1() {	//���Ǹ����е�fun1()����
		System.out.println("B --> public void fun1(){}");
	}
	public void fun3() {	//�����Լ�����ķ���
		System.out.println("B --> public voidd fun3(){}");
	}
}
class C4 extends A4{
	public void fun1() {
		System.out.println("C --> public void fun1(){}");
	}
	public void fun5() {
		System.out.println("C --> public void fun3(){}");
	}
}
public class PolDemo04 {
	public static void main(String[] args) {
		fun(new B4());	//����B��ʵ��
		fun(new C4());	//����C��ʵ��
	}
	public static void fun(B4 b) {	//��������B��ʵ��
		b.fun1();	//ͳһ���ø�д�����fun1()����
	}
	public static void fun(C4 c) {	//��������C��ʵ��
		c.fun1();
	}
}
