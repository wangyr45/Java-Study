package P156InnerClassDemo;

//4. �ڷ����ж����ڲ���

class Outer4 {
	private String info = "hello world!";
	public void fun(final int temp) {
		class Inner{
			public void print() {
				System.out.println("���е����ԣ�" + info);
				System.out.println("�����еĲ�����" + temp);
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
