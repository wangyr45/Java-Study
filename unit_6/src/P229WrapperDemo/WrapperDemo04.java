package P229WrapperDemo;

public class WrapperDemo04 {
	public static void main(String[] args) {
		String str1 = "30";
		String str2 = "30.3";
		int x = Integer.parseInt(str1);
		float f = Float.parseFloat(str2);
		System.out.println("�����˷���" + x + "*" + x + " = " + ( x + x ));
		System.out.println("С���˷���" + f + "*" + f + " = " + ( f + f ));
		
	}
}
