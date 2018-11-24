package NonameDemo;

//匿名对象:匿名对象就是没有明确给出名字的对象，一般匿名对象只使用一次。而且匿名对象只在堆内存中开辟空间，而不存在栈内存的引用。
class Person{
	private String name;
	private int age;
	public Person(String name,int age) {
		this.setName(name);
		this.setAge(age);
	}
	public void tell() {
		System.out.println("姓名：" + getName() + ",年龄：" + getAge());
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
		if(age >= 0 && age < 150) {
			this.age = age;
		}
	}
}
public class NonameDemo01 {
	public static void main(String args[]) {
		new Person("张三",30).tell();
	}
	
	
}
