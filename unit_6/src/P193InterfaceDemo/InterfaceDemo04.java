package P193InterfaceDemo;

interface A4{
	public String AUTHOR = "小李";//定义全局变量
	public void print();		//定义抽象方法
	public String getInfo();	//定义抽象方法
}
abstract class B4{				//定义抽象类B
	public abstract void say();
}
class X4 extends B4 implements A{	//子类同时实现接口
	public void say() {	//覆写抽象类B中的抽象方法
		System.out.println("hello world!");
	}
	public String getInfo() {	//覆写接口A中的抽象方法
		return "HELLO";
	}
	public void print() {	//覆写接口A中的抽象方法
		System.out.println("作者：" + AUTHOR);
	}
}
public class InterfaceDemo04 {
	public static void main(String[] args) {
		X4 x = new X4();
		x.say();
		x.print();
	}
}
