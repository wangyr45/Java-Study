package ClassDemo;

class Person{
	String name;
	int age;
	public void tell() {
		System.out.println("������" + name + "���䣺" + age);
	}
}

public class ClassDemo03 {
	public static void main(String[] args) {
		Person per = null;
		per.name = "����";
		per.age = 30;
		per.tell();
	}
}
