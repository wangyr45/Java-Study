package P148CodeDemo;

class Demo{
	{
		System.out.println("1.构造块");
	}
	static {
	System.out.println("0.静态代码块");
	}
	public Demo() {
		System.out.println("2.构造方法.");
	}
}
public class P148CodeDemo02 {
	static {
		System.out.println("在主方法所在类中定义的代码块。");
	}
	public static void main(String[] args) {
		new Demo();
		new Demo();
		new Demo();
		
	}
}
