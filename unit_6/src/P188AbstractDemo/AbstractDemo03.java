package P188AbstractDemo;
abstract class A3{
	public A3(){
		System.out.println("A、抽象类中丁一一构造方法");
	}
}
class B3 extends A3{
	public B3() {
		System.out.println("B、子类中的构造方法");
	}
}
public class AbstractDemo03 {
	public static void main(String[] args) {
		B3 b = new B3();
	}
}
