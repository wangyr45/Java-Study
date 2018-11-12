package Operator;
//验证“&&”的作用
public class OperatorDemo11 {
	public static void main(String[] args) {
		if(10! = 10 && 10/0 == 0) {	//短路与
			System.out.println("条件满足");
		}
	}
}	
