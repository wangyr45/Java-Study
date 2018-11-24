package P118StringAPIDemo;
//11.不区分大小写进行字符串比较
public class StringAPIDemo11 {
	public static void main(String[] args) {
		String str1 = "HELLO";
		String str2 = "hello";
		System.out.println("\"HELLO\"equals \"hello\""+ str1.equals(str2));
		System.out.println("\"HELLO\" equalsIgnoreCase \"hello\"" + str1.equalsIgnoreCase(str2));
		
				
	}
}
