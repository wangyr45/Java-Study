package P118StringAPIDemo;
//8.����ָ�����ַ�����ַ���
public class StringAPIDemo08 {
	public static void main(String[] args) {
		String str1 = "hello world";	//�����ַ���
		String s[] = str1.split(" ");	//���ո�����ַ����Ĳ��
		for(int i = 0; i < s.length; i++) {	//ѭ�����
			System.out.println(s[i]);
		}
	}
}
