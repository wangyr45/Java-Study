package ConsDemo;

class Person02{
	private String name;
	private int age;
	public Person02(String name,int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	public void tell() {
		System.out.println("姓名：" + getName() + ",年龄：" + getAge());
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
public class ConsDemo02 {
	public static void main(String[] args) {
		Person02 per = new Person02("张三",30);
		per.tell();
	}
}
