package DataDemo;

public class DataDemo03 {
	public static void main(String[] args) {
		int max = Integer.MAX_VALUE;	//整形最大值
		System.out.println("整型的最大值：" + max);	//输出最大值
		System.out.println("整型的最大值 + 1：" + (max + 1)); //最大值加1
		System.out.println("整型的最大值 + 2：" + (max + 2L));	//变为long型
		System.out.println("整型的最大值 + 2：" + ((long)max + 2)); //转换为long型
		
	}
}
//为了避难int类型溢出，可以在该表达时的任一常量后加上大写的L