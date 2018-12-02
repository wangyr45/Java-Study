package P193InterfaceDemo;

//接口的继承

interface A6{
	public String AUTHOR = "小王";
	public void printA();
}
interface B6{
	public void printB();
}
interface C6 extends A6,B6{
	public void printC();
}
class X6 implements C6{
	public void printA() {
		System.out.println("A、Hello World！");
	}
	public void printB() {
		System.out.println("B、Hello MLDN");
	}
	public void printC() {
		System.out.println("C、Hell LXH");
	}
}
public class InterfaceDemo06 {
	public static void main(String[] args) {
		X6 x = new X6();
		x.printA();
		x.printB();
		x.printC();
	}
}
