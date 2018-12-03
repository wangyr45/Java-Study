package P206AbstractCaseDemo;
/*
 * �������ʵ��Ӧ�� -- ģ�����
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
	public abstract String getContent();//˵�����������������
}
class Student extends Person{
	private float score;
	public Student(String name, int age , float score) {
		super(name,age);
		this.score = score;
	}
	public String getContent() {
		return "ѧ����Ϣ --> ������" + super.getName() + ":���䣺" + super.getAge()
			+ ":�ɼ���" + this.score;
	}
}
class Worker extends Person{
	private float salary;
	public Worker(String name, int age, float salary) {
		super(name,age);
		this.salary = salary;
	}
	public String getContent() {
		return "������Ϣ --> ������" + super.getName() + 
				"�����䣺" + super.getAge() +
				":����:" + this.salary;
	}
}
public class AbstractCaseDemo01 {
	public static void main(String[] args) {
		Person per1 = null;
		Person per2 = null;
		per1 = new Student("����",20,90.0f);
		per2 = new Student("����",30,3000.0f);
		per1.say();
		per2.say();
	}
	
}
