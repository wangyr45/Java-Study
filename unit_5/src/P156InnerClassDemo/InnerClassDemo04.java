package P156InnerClassDemo;

//在外部访问内部类
/*
 * 外部类.内部类  内部类对象 = 外部类实例.new 内部类();
 * 
 * */

class Outer3{	//定义外部类
	private String info = "hello world!";
	class Inner {	//定义内部类
		public void print() {	
			System.out.println(info); //访问外部类的私有属性
		}
	}
}
public class InnerClassDemo04 {
	public static void main(String[] args) {
		Outer3 out = new Outer3();	//实例化外部类对象
		Outer3.Inner in = out.new Inner();	//实例化内部类对象
		in.print();	//调用内部类方法
	}
}
