package P262ProtectedDemo;
import P262ProtectedDemo.HelloDemo;
class SubHelloDemo extends HelloDemo{
	public void print() {
		System.out.println("�����ܱ������ԣ�" + super.name);//���Է���protectedȨ��
	}
}
public class ProtectedDemo01 {
	public static void main(String[] args) {
		SubHelloDemo sub = new SubHelloDemo();
		sub.print();
	}
}
