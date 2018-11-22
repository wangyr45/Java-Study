package ClassDemo;

class Person1{
	String name;
	int age;
	public void tell() {
		System.out.println("姓名：" + name + "年龄：" + age);
	}
}
public class ClassDemo04 {
	public static void main(String[] args) {
		Person1 per1 = null;
		Person1 per2 = null;
		per1 = new Person1();
		per2 = new Person1();
		per1.name = "张三";
		per2.name = "李四";
		per1.age = 20;
		per2.age = 18;
		per1.tell();
		per2.tell();
	}
}
