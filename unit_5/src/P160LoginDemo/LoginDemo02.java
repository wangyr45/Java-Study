package P160LoginDemo;

class Check{
	public boolean validate(String name,String password) {
		if(name.equals("wangyurui") && password.equals("123456")) {
			return true;
		}else {
			return false;
		}
	}
}
class Operate{
	private String info[];
	public Operate(String info[]) {
		this.info = info;
	}
	public String login() {
		Check check = new Check();
		this.isExit();
		String name = this.info[0];
		String password = this.info[1];
		String str = null;
		if(check.validate(name, password)) {
			str = "��ӭ" + name + "���٣�";
		}else {
			str = "������û��������룡";
		}
		return str;
	}
	public void isExit() {
		if(this.info.length != 2) {
			System.out.println("����Ĳ�������ȷ��ϵͳ�Ƴ���");
			System.out.println("��ʽ��java LoginDeme02 �û��� ����");
			System.exit(1);
		}
	}
}
public class LoginDemo02 {
	public static void main(String[] args) {
		Operate oper = new Operate(args);
		System.out.println(oper.login());
	}
}
