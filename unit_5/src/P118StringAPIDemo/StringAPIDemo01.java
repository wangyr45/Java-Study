package P118StringAPIDemo;

//1.�ַ������ַ������ת��
public class StringAPIDemo01 {
	public static void main(String[] args) {
		String str1 = "hello";
		char c[] = str1.toCharArray();	//���ַ�����Ϊ�ַ�����
		for(int i = 0; i < c.length; i++) {	//ѭ�����
			System.out.println(c[i] + "\t");
		}
		System.out.println("");
		String str2 = new String(c);	//��ȫ���ַ�����ת��ΪString
		String str3 = new String(c,0,3);	//��ȫ���ַ�����ת��ΪString
		System.out.println(str2);
		System.out.println(str3);
		
	}
}
