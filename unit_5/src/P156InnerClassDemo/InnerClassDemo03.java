package P156InnerClassDemo;

//ʹ��static�����ڲ���

class Outer2{
	private static String info = "hello world!";
	static class Inner{	//ʹ��static�����ڲ���λ�ⲿ��
		public void print() {
			System.out.println(info);
		}
	}
}
public class InnerClassDemo03 {
	public static void main(String[] args) {
		new Outer2.Inner().print();	//�����ڲ���
	}
}
