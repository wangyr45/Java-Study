package P197PolDemo;

class A3{	//������A
	public void fun1() {	//����fun1()����
		System.out.println("A --> public void fun1(){}");
	}
	public void fun2() {	//����fun2()����
		this.fun1();
	}
}
class B3 extends A3{			//����ͨ��extends�̳и���
	public void fun1() {	//���Ǹ����е�fun1()����
		System.out.println("B --> public void fun1(){}");
	}
	public void fun3() {	//�����Լ�����ķ���
		System.out.println("B --> public voidd fun3(){}");
	}
}
public class PolDemo03 {
	public static void main(String[] args) {
		A3 a = new A3();	
		B3 b = (B3)a;		
		b.fun1();
		b.fun2();
		b.fun3();
	}
}
/*
 * �������䱾����ʵ�����Լ��Ķ��󣬵�����֪��˭���Լ������࣬�ǿ϶���ת��ʱ����ִ���
 * ��������ֻ��Ҫ�������������ù�ϵ���ɣ��������������ʱ�ȷ�������ת�͹�ϵ��A a = new B()��
 * ��ʱ�൱����������ȥʵ�����������Ҳ����˵��ʱ����֪������ôһ�����࣬Ҳ���൱�ڸ���֪�����Լ�����ôһ������
 * 
 * */
