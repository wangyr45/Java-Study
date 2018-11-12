package SimpleExpress;

public class SimpleExpressDemo02 {
	public static void main(String[] args) {
		int a = 10,b = 6;
		System.out.println("改变之前的数：a="+a+",b="+b);
		a-=b++;	//执行计算操作
		System.out.println("改变之后的数：a="+a+",b="+b);
	}
}
