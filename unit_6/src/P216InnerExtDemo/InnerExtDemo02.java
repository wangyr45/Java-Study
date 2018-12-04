package P216InnerExtDemo;
interface A2{
	public abstract void printA();
	abstract class B{
		public abstract void printB();
	}
}
class X2 implements A2{
	public void printA() {
		System.out.println("Hello --> A");
	}
	class Y extends B{
		public void printB() {
			System.out.println("Hello --> B");
		}
	}
}
public class InnerExtDemo02 {
	public static void main(String[] args) {
		A2.B b = new X2().new Y();
		b.printB();
	}
}
