package P132ThisDemo;

class Person2{
	private String name;
	private int age;
	public Person2() {	//�޲ι���
		System.out.println("һ���µ�Person����ʵ����");
	}
	public Person2(String name,int age) {
		this();//�˴�����Person���е��޲ι��췽��
		this.name = name;
		this.age =age;
	}
	public String getInfo() {
		return "������" + name + ",���䣺" + age;
	}
}
public class ThisDemo03 {
	public static void main(String[] args) {
		Person2 per1 = new Person2("����",30);
		System.out.println(per1.getInfo());
	}
}
