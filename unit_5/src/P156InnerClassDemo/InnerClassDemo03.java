package P156InnerClassDemo;

//使用static定义内部类

class Outer2{
	private static String info = "hello world!";
	static class Inner{	//使用static定义内部类位外部类
		public void print() {
			System.out.println(info);
		}
	}
}
public class InnerClassDemo03 {
	public static void main(String[] args) {
		new Outer2.Inner().print();	//访问内部类
	}
}
