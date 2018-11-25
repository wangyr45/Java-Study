package P123TestJava;

class Demo02{
	String temp = "hello";
}
public class RefDemo03 {
	public static void main(String[] args) {
		Demo02 d1 = new Demo02();
		d1.temp = "world";
		System.out.println("fun()方法调用之前：" + d1.temp);
		fun(d1);
		System.out.println("fun()方法调用之后：" + d1.temp);
	}
	public static void fun(Demo02 d1) {
		d1.temp = "MLDN";
	}
}
