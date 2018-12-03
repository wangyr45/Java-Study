package P205InterfaceCaseDemo;

interface A{	//定义接口A
	public abstract void print();	//定义抽象方法print()
}
class B implements A{	//子类实现接口
	public void print() {
		System.out.println("Hello World!!!");
	}
}
public class InterfaceCaseDemo01 {
	public static void main(String[] args) {
		A a = new B();
		a.print();
	}
}
