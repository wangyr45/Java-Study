package P118StringAPIDemo;

//1.字符串与字符数组的转换
public class StringAPIDemo01 {
	public static void main(String[] args) {
		String str1 = "hello";
		char c[] = str1.toCharArray();	//将字符串变为字符数组
		for(int i = 0; i < c.length; i++) {	//循环输出
			System.out.println(c[i] + "\t");
		}
		System.out.println("");
		String str2 = new String(c);	//将全部字符数组转变为String
		String str3 = new String(c,0,3);	//将全部字符数组转变为String
		System.out.println(str2);
		System.out.println(str3);
		
	}
}
