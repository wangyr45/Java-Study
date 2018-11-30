package P156InnerClassDemo;

//4. 在方法中定义内部类

class Outer4 {
	private String info = "hello world!";
	public void fun(final int temp) {
		class Inner{
			public void print() {
				System.out.println("类中的属性：" + info);
				System.out.println("方法中的参数：" + temp);
			}
		};
		new Inner().print();
	}
}
public class InnerClassDemo05 {
	public static void main(String[] args) {
		new Outer4().fun(30);
	}
}
