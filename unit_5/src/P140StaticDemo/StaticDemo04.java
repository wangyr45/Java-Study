package P140StaticDemo;


class Person{
	private String name;
	private int age;
	private static String country = "A城";
	public static void setCountry(String c) {
		country = c;
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void info() {	//信息输出
		System.out.println("姓名：" + this.name + ",年龄" + this.age + ",城市" + country);
	}
	public static String getCountry() {	//取得static属性
		return country;
	}
}
public class StaticDemo04 {
	public static void main(String[] args) {
		Person p1 = new Person("张三",30);
		Person p2 = new Person("李四",32);
		Person p3 = new Person("王五",23);
		System.out.println("----------修改之前---------");
		p1.info();
		p2.info();
		p3.info();
		System.out.println("----------修改之前---------");
		Person.setCountry("B城"); 
		p1.info();
		p2.info();
		p3.info();
		
	}
}
