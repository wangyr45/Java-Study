package ifdemo;

public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
		for(int x = 1; x <= 10; x++) {
			sum += x;
		}
		System.out.println("1-->10累加结果为："+ sum);
	}
}
