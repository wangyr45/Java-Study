package Operator;
//求出负数的反码
public class OperatorDemo16 {
	public static void main(String[] args) {
		int x = -3;	//-3的二进制数： 11111111 11111111 11111111 11111101
		System.out.println(x + "的反码是：" + ~x);
	}
}
