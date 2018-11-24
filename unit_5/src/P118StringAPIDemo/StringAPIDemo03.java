package P118StringAPIDemo;
//3.把一个字符变成一个byte数组，也可以把一个byte数组变成一个字符串
public class StringAPIDemo03 {
	public static void main(String[] args) {
		String str1 = "hello";
		byte b[] = str1.getBytes();
		System.out.println(new String(b));
		System.out.println(new String(b,1,3));
		
	}
}
