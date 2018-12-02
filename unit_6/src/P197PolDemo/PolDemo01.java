package P197PolDemo;
/*
 * 对象的多态化
 * 1.方法的重载与覆写
 * 2.对象的多态性
 * 
 * 对象转型
 * 1.向上转型： 父类 父类对象 = 子类实例
 * 2.向下转型：子类 子类对象 = （子类）父类实例
 * */
class A{	//定义类A
	public void fun1() {	//定义fun1()方法
		System.out.println("A --> public void fun1(){}");
	}
	public void fun2() {	//定义fun2()方法
		this.fun1();
	}
}
class B extends A{			//子类通过extends继承父类
	public void fun1() {	//覆盖父类中的fun1()方法
		System.out.println("B --> public void fun1(){}");
	}
	public void fun3() {	//子类自己定义的方法
		System.out.println("B --> public voidd fun3(){}");
	}
}
public class PolDemo01 {
	public static void main(String[] args) {
		B b = new B();	//定义子类实例化对象
		A a = b;	//发生了向上转型的关系，子类 --> 父类
		a.fun1();	//此方法被子类覆写过
	}
}
