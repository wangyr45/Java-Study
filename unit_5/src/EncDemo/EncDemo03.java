package EncDemo;

class Person13{
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
		this.age = age;
	}
	
	
}
public class EncDemo03 {
	public static void main(String[] args) {
		Person13 per = new Person13();
		per.setName("张三");
		per.setAge(-30);
		per.tell();
	}
}
