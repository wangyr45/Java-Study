package EncDemo;

class Person12{
	private String name;
	private int age;
	public void tell() {
		System.out.println("������" + name + "���䣺" + age);
	}
}
public class EncDemo02 {
	public static void main(String[] args) {
		Person12 per = new Person12();
		per.name = "����";
		per.age = -30;	//�����޷����ʷ�װ���ԡ�
		per.tell();
	}
}
