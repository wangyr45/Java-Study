package P118StringAPIDemo;

//12.��һ��ָ�����ַ����滻���������ַ���
public class StringAPIDemo12 {
	public static void main(String[] args) {
		String str = "hello";	//�����ַ���
		String newStr = str.replaceAll("1", "x");//���ڽ����е�1�滻Ϊx
		System.out.println("�滻֮��Ľ����" + newStr);
	}
}
