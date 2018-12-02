package P197PolDemo;
class A4{	//定义类A
	public void fun1() {	//定义fun1()方法
		System.out.println("A --> public void fun1(){}");
	}
	public void fun2() {	//定义fun2()方法
		this.fun1();
	}
}
class B4 extends A4{			//子类通过extends继承父类
	public void fun1() {	//覆盖父类中的fun1()方法
		System.out.println("B --> public void fun1(){}");
	}
	public void fun3() {	//子类自己定义的方法
		System.out.println("B --> public voidd fun3(){}");
	}
}
class C4 extends A4{
	public void fun1() {
		System.out.println("C --> public void fun1(){}");
	}
	public void fun5() {
		System.out.println("C --> public void fun3(){}");
	}
}
public class PolDemo04 {
	public static void main(String[] args) {
		fun(new B4());	//传递B类实例
		fun(new C4());	//传递C类实例
	}
	public static void fun(B4 b) {	//接受子类B的实例
		b.fun1();	//统一调用覆写父类的fun1()方法
	}
	public static void fun(C4 c) {	//接受子类C的实例
		c.fun1();
	}
}
