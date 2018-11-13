package ArrayRefDemo;

public class ArrayRefDemo02 {
	public static void main(String[] args) {
		int temp[] = fun();	//通过方法实例化数组
		print(temp);
	}
	public static void print(int x[]) {
		for(int i = 0;i < x.length;i++) {
			System.out.println(x[i] + "、");
		}
	}
	public static int[] fun() {
		int ss[] = {1,3,5,7,9};
		return ss;
	}
}
