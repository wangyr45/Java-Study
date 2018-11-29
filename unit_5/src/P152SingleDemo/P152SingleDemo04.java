package P152SingleDemo;

class Singleton{
	static Singleton instance = new Singleton();//在内部产生本类的实例化对象
	private Singleton() {	//此处将构造方法进行封装
		
	}
	public void pint() {
		System.out.println("Hello World!!");
	}
}
public class P152SingleDemo04 {
	public static void main(String[] args) {
		Singleton s1 = null;
		s1 = Singleton.instance;	//访问类中的静态属性
		s1.pint();
	}
}
