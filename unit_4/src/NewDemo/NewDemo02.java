package NewDemo;

public class NewDemo02 {
	public static void main(String[] args) {
		System.out.println("�����ݲ�����fun()��:");
		fun();
		System.out.println("\n����1��������fun()��:");
		fun(1);
		System.out.println("\n����5��������fun()��:");
		fun(1,2,3,4,5);
	}
	
	public static void fun(int...arg) {	//�ɱ���������Խ�������������
		for(int x : arg) {	//ʹ��foreach���
			System.out.println(x + "��");
		}
	}
}
