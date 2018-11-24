package P118StringAPIDemo;

//12.将一个指定的字符串替换成其他的字符串
public class StringAPIDemo12 {
	public static void main(String[] args) {
		String str = "hello";	//声明字符串
		String newStr = str.replaceAll("1", "x");//现在将所有的1替换为x
		System.out.println("替换之后的结果：" + newStr);
	}
}
