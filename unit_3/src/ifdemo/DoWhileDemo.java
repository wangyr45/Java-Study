package ifdemo;

public class DoWhileDemo {
	public static void main(String[] args) {
		int x = 1;
		int sum = 0;
		do {
			sum += x;
			x++;
		}while(x <= 10);
		System.out.println("1-->10�ۼӽ��Ϊ��" + sum);
	}
}
