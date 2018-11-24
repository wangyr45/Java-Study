package P118StringAPIDemo;
//8.按照指定的字符拆分字符串
public class StringAPIDemo08 {
	public static void main(String[] args) {
		String str1 = "hello world";	//定义字符串
		String s[] = str1.split(" ");	//被空格进行字符串的拆分
		for(int i = 0; i < s.length; i++) {	//循环输出
			System.out.println(s[i]);
		}
	}
}
