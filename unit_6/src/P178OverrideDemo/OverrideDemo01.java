package P178OverrideDemo;
/*
 * 方法的覆盖
 * 所谓的方法的覆盖就是指子类定义了与父类中同名的方法，
 * 但是在方法覆写时必须考虑到权限，即被子类覆盖的方法不能拥有比父类方法更加严格的访问权限
 * 
 * 
 * */

class Person{
	void print() { 	//定义了一个默认访问权限的方法
		System.out.println("Person --> void print()");
	}
}
class Student extends Person{//定义一个子类继承Person类
	public void print() {	//覆写父类中的方法，扩大了权限
		System.out.println("Student --> void print()");
	}
}

public class OverrideDemo01 {
	public static void main(String[] args) {
		new Student().print();	//此处执行的是被覆写过得方法
	}
}
