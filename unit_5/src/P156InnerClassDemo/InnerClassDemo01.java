package P156InnerClassDemo;

class Outer{
	private String info = "hello world!";
	public String getInfo() {	//取得私有属性
		return this.info;
	}
	public void fun() {
		new Inner(this).print();	//将当前对象传递到Inner中
	}
}

class Inner{
	private Outer out = null;	//声明外部类对象
	public Inner(Outer out) {	//接受外部类对象实例
		this.out = out;
	}
	public void print() {	//打印外部类的私有属性
		System.out.println(out.getInfo());
	}
}
public class InnerClassDemo01 {
	public static void main(String[] args) {	//调用Outer类的fun()
		new Outer().fun();
	}
}
