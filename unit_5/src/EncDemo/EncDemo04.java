package EncDemo;

class Person{
	private String name;
	private int age;
	public void tell() {
		System.out.println("姓名：" + name + "年龄：" + age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 0 && age < 150)
		this.age = age;
	}
	
}
public class EncDemo04 {
	public static void main(String[] args) {
		Person per = new Person();
		per.setName("张三");
		per.setAge(-30);
		per.tell();
	}
}
