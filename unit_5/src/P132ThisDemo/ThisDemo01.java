package P132ThisDemo;

class Person{
	private String name;
	private int age;
	public Person(String name,int age) {
		name = name;
		age =age;
	}
	public String getInfo() {
		return "������" + name + ",���䣺" + age;
	}
}
public class ThisDemo01 {
	public static void main(String[] args) {
		Person per1 = new Person("����",30);
		System.out.println(per1.getInfo());
	}
}
