package P57String;
//ʹ��equals������String�����ݽ��бȽ�


public class StringDemo05 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = new String("hello");
		String str3 = str2;
		System.out.println("Str1 equals str2 -- >" + (str1.equals(str2)));
		System.out.println("Str2 equals str3 -- >" + (str1.equals(str3)));
		System.out.println("Str3 equals str3 -- >" + (str2.equals(str3)));
		
	}
}
