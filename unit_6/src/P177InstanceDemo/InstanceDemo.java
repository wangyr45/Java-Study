package P177InstanceDemo;
//��������ʵ��������
class Person{
	private String name;
	private int age;
	public Person() {
		System.out.println("����Person�еĹ��졣");
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

class Student extends Person{
	private String school;
	public Student() {
		System.out.println("����Student�еĹ��졣");
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}	
}
/*
 * ���Է������������ʵ����ǰ����Ĭ�ϵ��ø����еĹ��췽�����ͺ���û�и��׾�û�к��ӡ�
 * ������ʵ�����������ǰ��Ҫ�Ƚ������е����Խ��г�ʼ����
 * �������ϴ���ʵ��������Ĺ��췽����������һ��super�������﷨��
 * */
public class InstanceDemo {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("����");
		stu.setAge(30);
		stu.setSchool("�廪��ѧ");
		System.out.println("������" + stu.getAge() + "�����䣺" + stu.getAge()
		+ ",ѧУ��" + stu.getSchool());
	}
}
