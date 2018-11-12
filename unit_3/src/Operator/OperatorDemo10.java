package Operator;
//验证“&”的作用
public class OperatorDemo10 {
	public static void main(String[] args) {
		if(10! = 10 & 10/0 == 0) {	//非短路与
			System.out.println("条件满足");
		}
	}
}
//造成以上对1根本原因在于“与”操作要把所有的条件进行判断，所以在计算10/0时出现了错误。