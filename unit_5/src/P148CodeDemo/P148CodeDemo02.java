package P148CodeDemo;

class Demo{
	{
		System.out.println("1.�����");
	}
	static {
	System.out.println("0.��̬�����");
	}
	public Demo() {
		System.out.println("2.���췽��.");
	}
}
public class P148CodeDemo02 {
	static {
		System.out.println("���������������ж���Ĵ���顣");
	}
	public static void main(String[] args) {
		new Demo();
		new Demo();
		new Demo();
		
	}
}
