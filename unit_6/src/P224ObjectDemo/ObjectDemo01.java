package P224ObjectDemo;
class Demo{
	
}
public class ObjectDemo01 {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println("不加toString()输出" + d);
		System.out.println("加上toString()输出" + d.toString());
	}
}
