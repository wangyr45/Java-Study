package P197PolDemo;
class A5{	//定义类A
	public void fun1() {	//定义fun1()方法
		System.out.println("A --> public void fun1(){}");
	}
	public void fun2() {	//定义fun2()方法
		this.fun1();
	}
}
class B5 extends A5{			//子类通过extends继承父类
	public void fun1() {	//覆盖父类中的fun1()方法
		System.out.println("B --> public void fun1(){}");
	}
	public void fun3() {	//子类自己定义的方法
		System.out.println("B --> public voidd fun3(){}");
	}
}
class C5 extends A5{		//子类通过extends继承父类
	public void fun1() {	//子类覆写父类中的fun1()方法
		System.out.println("C --> public void fun1(){}");
	}
	public void fun5() {	//子类自己定义的方法
		System.out.println("C --> public void fun3(){}");
	}
}
public class PolDemo05 {
	public static void main(String[] args) {
		fun(new B5());	//传递B类实例，产生向上转型
		fun(new C5());	//传递C类实例，产生向上转型
	}
	public static void fun(A5 a) {//接受父类对象
		a.fun1();
	}
}
