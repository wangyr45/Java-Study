package P178OverrideDemo;
class Person3{
	private void print() {
		System.out.println("Person --> void print()");
	}
	public void fun() {
		this.print();
	}
}
class Student3 extends Person3{
	void print() {
		System.out.println("Student --> void print()");
	}
}

public class OverrideDemo04 {
	public static void main(String[] args) {
		new Student3().fun();
	}
}
