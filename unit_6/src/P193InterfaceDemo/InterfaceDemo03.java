package P193InterfaceDemo;

interface A{						//定义接口A
	public String AUTHOR = "小张";	//定义全局常量
	public void print();			//定义抽象方法
	public String getInfo();		//定义抽象方法
}
interface B{			//定义接口B
	public void say();	//定义抽象方法
}
class X implements A,B{			//子类同事实现两个接口
	public void say() {			//覆写B接口中的抽象方法
		System.out.println("Hello World!!!");
	}
	public String getInfo() {	//覆写A接口中的抽象方法
		return "Hello";
	}
	public void print() {		//覆写A接口中的抽象方法
		System.out.println("作者：" + AUTHOR);
	}
}
public class InterfaceDemo03 {
	public static void main(String[] args) {
		X x = new X();	//实例化子类对象
		x.say();		//调用被覆写过的方法
		x.print();		//调用被覆写过的方法
	}
}
