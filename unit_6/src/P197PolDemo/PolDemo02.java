package P197PolDemo;

class A2{	//定义类A
	public void fun1() {	//定义fun1()方法
		System.out.println("A --> public void fun1(){}");
	}
	public void fun2() {	//定义fun2()方法
		this.fun1();
	}
}
class B2 extends A2{			//子类通过extends继承父类
	public void fun1() {	//覆盖父类中的fun1()方法
		System.out.println("B --> public void fun1(){}");
	}
	public void fun3() {	//子类自己定义的方法
		System.out.println("B --> public voidd fun3(){}");
	}
}
public class PolDemo02 {
	public static void main(String[] args) {
		A2 a = new B2();	//发生了向上转型的关系，子类 --> 父类
		B2 b = (B2)a;		//此时发生了向下转型关系
		b.fun1();		//调用方法被覆写的方法
		b.fun2();		//调用父类的方法
		b.fun3();		//调用子类自己定义的方法
	}
}
