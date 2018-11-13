package MethodDemo;

//方法的递归调用

public class MethodDemo06 {
	public static void main(String[] args) {
		System.out.println("计算结果是：" + sum(100));
	}
	public static int sum(int num) {
		if(num == 1) {
			return 1;
		}else {
			return num + sum(num - 1);
		}
	}
}
