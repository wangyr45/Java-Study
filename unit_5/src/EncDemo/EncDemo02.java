package EncDemo;

class Person12{
	private String name;
	private int age;
	public void tell() {
		System.out.println("姓名：" + name + "年龄：" + age);
	}
}
public class EncDemo02 {
	public static void main(String[] args) {
		Person12 per = new Person12();
		per.name = "张三";
		per.age = -30;	//错误。无法访问封装属性。
		per.tell();
	}
}
