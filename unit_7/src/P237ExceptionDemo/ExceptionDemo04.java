package P237ExceptionDemo;

public class ExceptionDemo04 {
	public static void main(String[] args) {
		System.out.println("���㿪ʼ");
		int i = 0;
		int j = 0;
		try {
			String str1 = args[0];
			String str2 = args[1];
			i = Integer.parseInt(str1);
			j = Integer.parseInt(str2);
			int temp = i / j;
			System.out.println("����������������" + temp);
			System.out.println("---------");
		}catch(ArithmeticException e) {
			System.out.println("�����쳣�ˣ�" + e);
		}
		System.out.println("�������");
	}
}
