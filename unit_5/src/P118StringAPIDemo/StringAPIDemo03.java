package P118StringAPIDemo;
//3.��һ���ַ����һ��byte���飬Ҳ���԰�һ��byte������һ���ַ���
public class StringAPIDemo03 {
	public static void main(String[] args) {
		String str1 = "hello";
		byte b[] = str1.getBytes();
		System.out.println(new String(b));
		System.out.println(new String(b,1,3));
		
	}
}
