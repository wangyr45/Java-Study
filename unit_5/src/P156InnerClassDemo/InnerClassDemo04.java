package P156InnerClassDemo;

//���ⲿ�����ڲ���
/*
 * �ⲿ��.�ڲ���  �ڲ������ = �ⲿ��ʵ��.new �ڲ���();
 * 
 * */

class Outer3{	//�����ⲿ��
	private String info = "hello world!";
	class Inner {	//�����ڲ���
		public void print() {	
			System.out.println(info); //�����ⲿ���˽������
		}
	}
}
public class InnerClassDemo04 {
	public static void main(String[] args) {
		Outer3 out = new Outer3();	//ʵ�����ⲿ�����
		Outer3.Inner in = out.new Inner();	//ʵ�����ڲ������
		in.print();	//�����ڲ��෽��
	}
}
