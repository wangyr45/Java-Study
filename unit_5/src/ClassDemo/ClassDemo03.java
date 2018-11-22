package ClassDemo;

class Person{
	String name;
	int age;
	public void tell() {
		System.out.println("姓名：" + name + "年龄：" + age);
	}
}

public class ClassDemo03 {
	public static void main(String[] args) {
		Person per = null;
		per.name = "张三";
		per.age = 30;
		per.tell();
	}
}
