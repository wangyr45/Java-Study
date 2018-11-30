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
		Person per[] = {new Person("张三"),new Person("李四"),
				new Person("王五")};
		System.out.println("=====数组输出=====");
		for(int x = 0; x < per.length; x++) {
			System.out.println(per[x].getName() + "、");
		}
	}
}
