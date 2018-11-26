package P132ThisDemo;

class Person2{
	private String name;
	private int age;
	public Person2() {	//无参构造
		System.out.println("一个新的Person对象被实例化");
	}
	public Person2(String name,int age) {
		this();//此处调用Person类中的无参构造方法
		this.name = name;
		this.age =age;
	}
	public String getInfo() {
		return "姓名：" + name + ",年龄：" + age;
	}
}
public class ThisDemo03 {
	public static void main(String[] args) {
		Person2 per1 = new Person2("张三",30);
		System.out.println(per1.getInfo());
	}
}
