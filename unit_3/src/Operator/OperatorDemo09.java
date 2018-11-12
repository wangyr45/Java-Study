package Operator;

public class OperatorDemo09 {
	public static void main(String[] args) {
		int x = 10/0; //定义变量
		System.out.println("x = " + x); //错误，被除数为0
	}
}

//造成错误根本原因在于被除数为0
