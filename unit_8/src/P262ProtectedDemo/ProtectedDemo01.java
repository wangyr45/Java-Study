package P262ProtectedDemo;
import P262ProtectedDemo.HelloDemo;
class SubHelloDemo extends HelloDemo{
	public void print() {
		System.out.println("访问受保护属性：" + super.name);//可以访问protected权限
	}
}
public class ProtectedDemo01 {
	public static void main(String[] args) {
		SubHelloDemo sub = new SubHelloDemo();
		sub.print();
	}
}
