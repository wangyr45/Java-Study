package Operator;

public class OperatorDemo05 {
	public static void main(String[] args) {
		if(5>2) {	//判断 5 是否大于 2
			System.out.println("条件成立：5 大于 2");
		}
		if(true)		//判断是否为真
			System.out.println("直接写的true");
		if((3 + 6) == (3 - 6)) {	//判断计算结果内容是否相等
			System.out.println("这是不可能成立的！");
		}
	}
}
