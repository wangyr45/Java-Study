package MethodDemo;

//ʹ��return����һ������

public class MethodDemo05 {
	public static void main(String[] args) {
		System.out.println("1������fun��������֮ǰ��");
		fun(10);
		System.out.println("2������fun��������֮��");
	}
	public static void fun(int x) {
		System.out.println("3������fun��������");
		if(x==10) {
			return;
		}
		System.out.println("4������ִ����fun��������");
	}
}
