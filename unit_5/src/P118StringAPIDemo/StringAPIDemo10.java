package P118StringAPIDemo;
//10.�ж��Ƿ���ָ�����ַ�����ͷ���β
public class StringAPIDemo10 {
	
	public static void main(String[] args) {
		String str1 = "**HELLO";
		String str2 = "HELLO**";
		if(str1.startsWith("**")) {
			System.out.println("(**HELLO) �� **��ͷ");
			
		}
		if(str2.endsWith("**")) {
			System.out.println("(HELLO**) ��**��β");
		}
	}
	
}
