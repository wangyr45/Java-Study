package P160LoginDemo;

public class LoginDemo01 {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("����Ĳ�������ȷ,ϵͳ�˳���");
			System.out.println("��ʽ��java LoginDemo01 �û��� ����");
			System.exit(1);
		}
		String name = args[0];
		String password = args[1];
		if(name.equals("wangyurui") && password.equals("123456")) {
			System.out.println("��ӭ" + name + "���٣�");
		}else {
			System.out.println("������û��������룡");
		}
	}
}
