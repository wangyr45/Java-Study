package P237ExceptionDemo;

public class ExceptionDemo02 {
	public static void main(String[] args) {
		System.out.println("----计算开始----");
		int i = 10;
		int j = 0;
		try {
		int temp = i / j;
		System.out.println("两个数字相除结果：" + temp);
		System.out.println("------------");
		}catch(ArithmeticException e) {
			System.out.println("出现异常了：" + e);
		}
		
		System.out.println("----计算结束----");
	}
}
