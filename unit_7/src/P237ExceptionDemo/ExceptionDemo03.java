package P237ExceptionDemo;

public class ExceptionDemo03 {
	public static void main(String[] args) {
		System.out.println("���㿪ʼ");
		int i = 10;
		int j = 0;
		try {
			int temp = i / j;
			System.out.println("����������������" + temp);
			System.out.println("-----------");
		}catch(ArithmeticException e) {
			System.out.println("�����쳣�ˣ�" + e);
		}finally {
			System.out.println("�����Ƿ�����쳣����ִ�д˴���");
		}
		System.out.println("�������");
	}
}
