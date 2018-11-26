package P132ThisDemo;

class Person1{
	private String name;
	private int age;
	public Person1(String name,int age) {
		this.name = name;
		this.age =age;
	}
	public String getInfo() {
		return "姓名：" + name + ",年龄：" + age;
	}
}
public class ThisDemo02 {
	public static void main(String[] args) {
		Person1 per1 = new Person1("张三",30);
		System.out.println(per1.getInfo());
	}
}
