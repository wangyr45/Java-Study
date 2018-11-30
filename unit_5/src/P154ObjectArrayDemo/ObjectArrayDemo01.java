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
		System.out.println("====数组声明====");
		for(int x = 0; x < per.length ; x++) {
			System.out.println(per[x] + "、");
		}
		per[0] = new Person("张三");
		per[1] = new Person("李四");
		per[2] = new Person("王五");
		System.out.println("====对象实例化====");
		
		for(int x = 0 ; x < per.length; x++) {
			System.out.println(per[x].getName() + "、");
		}
	}
}
