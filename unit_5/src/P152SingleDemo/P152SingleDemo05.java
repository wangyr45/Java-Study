package P152SingleDemo;

class Singleton02{
	private static Singleton02 instance = new Singleton02();
	private Singleton02() {}
	public static Singleton02 getInstance() {
		return instance;
	}
	public void print() {
		System.out.println("Hello World!!");
	}
}
public class P152SingleDemo05 {	
	public static void main(String[] args) {
		Singleton02 s1 = Singleton02.getInstance();
		Singleton02 s2 = Singleton02.getInstance();
		Singleton02 s3 = Singleton02.getInstance();
		s1.print();
		s2.print();
		s3.print();
	}
}
