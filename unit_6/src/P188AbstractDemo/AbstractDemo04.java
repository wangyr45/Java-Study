package P188AbstractDemo;

abstract class Person{	//���������Person
	private String name;//����name����
	private int age;	//����age����
	public Person(String name,int age) {//�ڳ������ж��幹�췽��
		this.setName(name);	//Ϊname��ֵ
		this.setAge(age);	//Ϊage��ֵ
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
	public abstract String getInfo();//ȡ����Ϣ�����󷽷�
	
}
class Student extends Person{
	private String school;
	public Student(String name,int age,String school) {
		super(name,age);	//���ø����������������Ĺ��췽��
		this.setSchool(school);	//Ϊschool��ֵ
	}
	public String getSchool() {	//ȡ��school����
		return school;
	}
	public void setSchool(String school) {//����school����
		this.school = school;
	}
	public String getInfo() {	//��д�������еĳ��󷽷�
		return "������" + super.getName() + 
				":���䣺" + super.getAge() +
				":ѧУ��" + this.getSchool();
	}
}
public class AbstractDemo04 {
	public static void main(String[] args) {
		Student stu = new Student("����",30,"�廪��ѧ");
		System.out.println(stu.getInfo());
	}
}
