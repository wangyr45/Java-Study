package P118StringAPIDemo;
//5.查找一个指定的字符串是否存在
public class StringAPIDemo05 {
	public static void main(String[] args) {
		String str1 = "abcdefgcgh";
		System.out.println(str1.indexOf("c"));
		System.out.println(str1.indexOf("c",3));
		System.out.println(str1.indexOf("x"));
	}
}
