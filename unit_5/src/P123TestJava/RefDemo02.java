package P123TestJava;

public class RefDemo02 {
	public static void main(String[] args) {
		String str1 = "hello";
		System.out.println("fun()��������֮ǰ��" + str1);
		fun(str1);
		System.out.println("fun()��������֮��" + str1);
	}
	public static void fun(String str2) {
		str2 = "MLDN";
	}
}
