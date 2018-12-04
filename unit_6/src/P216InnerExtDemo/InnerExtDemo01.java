package P216InnerExtDemo;
abstract class A{					//定义抽象类
	public abstract void printA();	//定义抽象方法
	interface B{					//定义内部接口
		public void printB();		//定义抽象方法
	}
}
class X extends A{					//继承抽象类
	public void printA() {			//实现抽象方法
		System.out.println("Hello -- > A");
	}
	class Y implements B{			//定义内部类实现内部接口
		public void printB() {		//实现内部接口的抽象方法
			System.out.println("Hello -- > B");
		}
	}
}
public class InnerExtDemo01 {
	public static void main(String[] args) {
		A.B b = new X().new Y();	//实例化内部接口对象
		b.printB();					//调用内部接口的抽象方法
	}
}
