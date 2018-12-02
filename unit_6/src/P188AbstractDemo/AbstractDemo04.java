package P188AbstractDemo;

abstract class Person{	//定义抽象类Person
	private String name;//定义name属性
	private int age;	//定义age属性
	public Person(String name,int age) {//在抽象类中定义构造方法
		this.setName(name);	//为name赋值
		this.setAge(age);	//为age赋值
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
	public abstract String getInfo();//取得信息，抽象方法
	
}
class Student extends Person{
	private String school;
	public Student(String name,int age,String school) {
		super(name,age);	//调用父类中有两个参数的构造方法
		this.setSchool(school);	//为school赋值
	}
	public String getSchool() {	//取得school属性
		return school;
	}
	public void setSchool(String school) {//设置school属性
		this.school = school;
	}
	public String getInfo() {	//覆写抽象类中的抽象方法
		return "姓名：" + super.getName() + 
				":年龄：" + super.getAge() +
				":学校：" + this.getSchool();
	}
}
public class AbstractDemo04 {
	public static void main(String[] args) {
		Student stu = new Student("张三",30,"清华大学");
		System.out.println(stu.getInfo());
	}
}
