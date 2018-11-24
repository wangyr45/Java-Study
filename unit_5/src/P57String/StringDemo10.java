package P57String;

public class StringDemo10 {
	public static void main(String[] args) {
		String str1 = "fake";
		for(int i = 0; i < 100; i++) {
			str1 += i;
		}
		System.out.println(str1);
	}
}
