package P197PolDemo;

class A3{	//定义类A
	public void fun1() {	//定义fun1()方法
		System.out.println("A --> public void fun1(){}");
	}
	public void fun2() {	//定义fun2()方法
		this.fun1();
	}
}
class B3 extends A3{			//子类通过extends继承父类
	public void fun1() {	//覆盖父类中的fun1()方法
		System.out.println("B --> public void fun1(){}");
	}
	public void fun3() {	//子类自己定义的方法
		System.out.println("B --> public voidd fun3(){}");
	}
}
public class PolDemo03 {
	public static void main(String[] args) {
		A3 a = new A3();	
		B3 b = (B3)a;		
		b.fun1();
		b.fun2();
		b.fun3();
	}
}
/*
 * 父类用其本身类实例化自己的对象，但他不知道谁是自己的子类，那肯定在转换时会出现错误
 * 纠正错误只需要将两个对象建立好关系即可，在声明父类对象时先发生向上转型关系“A a = new B()”
 * 这时相当于是由子类去实例化父类对象，也就是说这时父类知道有这么一个子类，也就相当于父亲知道了自己有这么一个孩子
 * 
 * */
