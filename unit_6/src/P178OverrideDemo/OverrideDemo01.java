package P178OverrideDemo;
/*
 * �����ĸ���
 * ��ν�ķ����ĸ��Ǿ���ָ���ඨ�����븸����ͬ���ķ�����
 * �����ڷ�����дʱ���뿼�ǵ�Ȩ�ޣ��������า�ǵķ�������ӵ�бȸ��෽�������ϸ�ķ���Ȩ��
 * 
 * 
 * */

class Person{
	void print() { 	//������һ��Ĭ�Ϸ���Ȩ�޵ķ���
		System.out.println("Person --> void print()");
	}
}
class Student extends Person{//����һ������̳�Person��
	public void print() {	//��д�����еķ�����������Ȩ��
		System.out.println("Student --> void print()");
	}
}

public class OverrideDemo01 {
	public static void main(String[] args) {
		new Student().print();	//�˴�ִ�е��Ǳ���д���÷���
	}
}
