package MethodDemo;

//�����ĵݹ����

public class MethodDemo06 {
	public static void main(String[] args) {
		System.out.println("�������ǣ�" + sum(100));
	}
	public static int sum(int num) {
		if(num == 1) {
			return 1;
		}else {
			return num + sum(num - 1);
		}
	}
}
