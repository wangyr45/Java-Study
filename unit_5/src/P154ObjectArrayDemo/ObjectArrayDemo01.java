package P154ObjectArrayDemo;

class Person{
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
public class ObjectArrayDemo01 {
	public static void main(String[] args) {
		Person per[] = new Person[3];
		System.out.println("====��������====");
		for(int x = 0; x < per.length ; x++) {
			System.out.println(per[x] + "��");
		}
		per[0] = new Person("����");
		per[1] = new Person("����");
		per[2] = new Person("����");
		System.out.println("====����ʵ����====");
		
		for(int x = 0 ; x < per.length; x++) {
			System.out.println(per[x].getName() + "��");
		}
	}
}
