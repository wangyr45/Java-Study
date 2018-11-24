package P118StringAPIDemo;
//10.判断是否以指定的字符串开头或结尾
public class StringAPIDemo10 {
	
	public static void main(String[] args) {
		String str1 = "**HELLO";
		String str2 = "HELLO**";
		if(str1.startsWith("**")) {
			System.out.println("(**HELLO) 以 **开头");
			
		}
		if(str2.endsWith("**")) {
			System.out.println("(HELLO**) 以**结尾");
		}
	}
	
}
