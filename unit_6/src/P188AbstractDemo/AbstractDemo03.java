package P188AbstractDemo;
abstract class A3{
	public A3(){
		System.out.println("A���������ж�һһ���췽��");
	}
}
class B3 extends A3{
	public B3() {
		System.out.println("B�������еĹ��췽��");
	}
}
public class AbstractDemo03 {
	public static void main(String[] args) {
		B3 b = new B3();
	}
}
