package NonameDemo;

//��������:�����������û����ȷ�������ֵĶ���һ����������ֻʹ��һ�Ρ�������������ֻ�ڶ��ڴ��п��ٿռ䣬��������ջ�ڴ�����á�
class Person{
	private String name;
	private int age;
	public Person(String name,int age) {
		this.setName(name);
		this.setAge(age);
	}
	public void tell() {
		System.out.println("������" + getName() + ",���䣺" + getAge());
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
		new Person("����",30).tell();
	}
	
	
}
