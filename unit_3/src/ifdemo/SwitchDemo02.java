package ifdemo;

public class SwitchDemo02 {
	public static void main(String[] args) {
		int x = 3;
		int y = 6;
		char oper = '+';
		switch(oper) {
			case '+':{
				System.out.println("x + y = " + (x + y));
				
			} 
			case '-':{
				System.out.println("x - y = " + (x - y));
				
			}
			case '*':{
				System.out.println("x * y = " + (x * y));
				
			}case '/':{
				System.out.println("x / y = " + (x / y));
				
			}
			default: {
				System.out.println("未知的条件！");
				
			}
		}
	}
}	
