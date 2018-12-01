package P178OverrideDemo;
class Person2{
	void print() {	//定义一个默认访问权限的方法
		System.out.println("Person --> void print()");
	}
}
class Student2 extends Person{//定义一个子类继承Person类
	public void print() {	  //覆写父类中的方法，扩大了权限
		super.print();//调用父类中的print()方法
		System.out.println("Student --> void print()");
	}
}
public class OverrideDemo02 {
	public static void main(String[] args) {
		new Student2().print();
	}
}
