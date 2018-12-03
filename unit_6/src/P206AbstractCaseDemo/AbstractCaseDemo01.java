package P206AbstractCaseDemo;
/*
 * 抽象类的实际应用 -- 模板设计
 * 
 * */
abstract class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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
	public void say() {
		System.out.println(this.getContent());
	}
	public abstract String getContent();//说话的内容由子类决定
}
class Student extends Person{
	private float score;
	public Student(String name, int age , float score) {
		super(name,age);
		this.score = score;
	}
	public String getContent() {
		return "学生信息 --> 姓名：" + super.getName() + ":年龄：" + super.getAge()
			+ ":成绩：" + this.score;
	}
}
class Worker extends Person{
	private float salary;
	public Worker(String name, int age, float salary) {
		super(name,age);
		this.salary = salary;
	}
	public String getContent() {
		return "工人信息 --> 姓名：" + super.getName() + 
				"：年龄：" + super.getAge() +
				":工资:" + this.salary;
	}
}
public class AbstractCaseDemo01 {
	public static void main(String[] args) {
		Person per1 = null;
		Person per2 = null;
		per1 = new Student("张三",20,90.0f);
		per2 = new Student("李四",30,3000.0f);
		per1.say();
		per2.say();
	}
	
}
