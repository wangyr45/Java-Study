package ConsDemo;

class Person{
	public Person() {
		System.out.println("һ���µ�Person�������");
	}
}
public class ConsDemo01 {
	public static void main(String[] args) {
		System.out.println("��������Person per = null");
		Person per = null;	//��������ʱ�����ù���
		System.out.println("ʵ��������per = new Person() ;");
		per = new Person();		//ʵ��������ʱ���ù���
	}
}
