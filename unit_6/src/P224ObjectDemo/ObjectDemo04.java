package P224ObjectDemo;
interface A{
	public String getInfo();
}
class B implements A{
	public String getInfo() {
		return "Hello World!";
	}
}
public class ObjectDemo04 {
	public static void main(String[] args) {
		A a = new B();		//Ϊ�ӿ�ʵ����
		Object obj = a;		//��������ת��
		A x = (A)obj;		//��������ת��
		System.out.println(x.getInfo());
	}
}
