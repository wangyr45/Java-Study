package P154ObjectArrayDemo;


class Person01{
	private String name;
	public Person01(String name) {
		this.name = name;
	
	}
	public String getName() {
		return this.name;
	}
}
public class ObjectArrayDemo02 {
	public static void main(String[] args) {
		Person per[] = {new Person("����"),new Person("����"),
				new Person("����")};
		System.out.println("=====�������=====");
		for(int x = 0; x < per.length; x++) {
			System.out.println(per[x].getName() + "��");
		}
	}
}
