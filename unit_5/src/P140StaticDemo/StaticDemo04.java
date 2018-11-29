package P140StaticDemo;


class Person{
	private String name;
	private int age;
	private static String country = "A��";
	public static void setCountry(String c) {
		country = c;
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void info() {	//��Ϣ���
		System.out.println("������" + this.name + ",����" + this.age + ",����" + country);
	}
	public static String getCountry() {	//ȡ��static����
		return country;
	}
}
public class StaticDemo04 {
	public static void main(String[] args) {
		Person p1 = new Person("����",30);
		Person p2 = new Person("����",32);
		Person p3 = new Person("����",23);
		System.out.println("----------�޸�֮ǰ---------");
		p1.info();
		p2.info();
		p3.info();
		System.out.println("----------�޸�֮ǰ---------");
		Person.setCountry("B��"); 
		p1.info();
		p2.info();
		p3.info();
		
	}
}
