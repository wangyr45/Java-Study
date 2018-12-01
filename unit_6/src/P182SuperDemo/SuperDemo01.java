package P182SuperDemo;

class Person{
	private String name;
	private int age;
	public Person(String name,int age) {
		this.setName(name);
		this.setAge(age);
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
	public String getInfo() {
		return "������" + this.getName() + ":���䣺" + this.getAge();
	}
}
class Student extends Person{
	private String school;
	public Student(String name,int age,String school) {
		super(name,age);
		this.setSchool(school);
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getInfo() {
		return super.getInfo() + ":ѧУ��" + this.getSchool();
	}
}
public class SuperDemo01 {
	public static void main(String[] args) {
		Student stu = new Student("����",30,"�廪��ѧ");
		System.out.println(stu.getInfo());
	}
}
