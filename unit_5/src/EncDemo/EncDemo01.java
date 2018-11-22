package EncDemo;

class Person11{
	String name;
	int age;
	public void tell() {
		System.out.println("姓名：" + name + "年龄：" + age);
	}
}
public class EncDemo01 {
	public static void main(String[] args) {
		Person11 per = new Person11();
		per.name = "张三";
		per.age = 30;
		per.tell();
	}
}
