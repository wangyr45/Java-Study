package Operator;

//位运算

public class OperatorDemo15 {
	public static void main(String[] args) {
		int x = 3;	//3的二进制数据00000000 00000000
		int y = 6;	//6的二进制数据00000000 00000011
		System.out.println( x & y);	//与操作
		System.out.println(x | y);	//或操作
		System.out.println(x ^ y);	//异或操作
		
	}
}
