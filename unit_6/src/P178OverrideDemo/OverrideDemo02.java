package P178OverrideDemo;
class Person2{
	void print() {	//����һ��Ĭ�Ϸ���Ȩ�޵ķ���
		System.out.println("Person --> void print()");
	}
}
class Student2 extends Person{//����һ������̳�Person��
	public void print() {	  //��д�����еķ�����������Ȩ��
		super.print();//���ø����е�print()����
		System.out.println("Student --> void print()");
	}
}
public class OverrideDemo02 {
	public static void main(String[] args) {
		new Student2().print();
	}
}
