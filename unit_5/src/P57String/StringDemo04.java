package P57String;

public class StringDemo04 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = new String("hello");
		String str3 = str2;
		System.out.println("Str1 == Str2" + (str1 == str2));
		System.out.println("Str1 == Str3" + (str1 == str3));
		System.out.println("Str2 == Str3" + (str2 == str3));
		
	}
}
//从上面实例来看，“ == ”是根据地址比较的