package P123TestJava;

//引用传递及基本应用
class Demo{
	String temp = "hello";	//此处为了访问方便，属性暂时不封装
}
public class TestJava0538 {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.temp = "world";
		System.out.println("fun()方法调用之前：" + d1.temp);
		fun(d1);
		System.out.println("fun()方法调用之后：" + d1.temp);
	}
	public static void fun(Demo d2) {	//此处方法由主方法直接调用
		d2.temp = "MLDN";
	}
}
