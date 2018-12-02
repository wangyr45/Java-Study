package P193InterfaceDemo;

interface A5{//定义接口A
	public String AUTHOR = "小王";//定义全局变量
	public void print();	//定义抽象方法
	public String getInfo();//定义抽象方法
}
abstract class B5 implements A5{//定义抽象类，实现接口
	public abstract void say();	//此时抽象类中存在3个抽象方法
}
class X5 extends B5{	//子类继承抽象类
	public void say() {	//覆写抽象类B中的抽象方法
		System.out.println("Hello World!");
	}
	public String getInfo() {	//覆写抽象类B中的抽象方法
		return "Hello";
	}
	public void print() {	//覆写抽象类B中的抽象方法
		System.out.println("作者：" + AUTHOR);
	}
}
public class InterfaceDemo05 {
	public static void main(String[] args) {
		X5 x = new X5();
		x.say();
		x.print();
	}
}
