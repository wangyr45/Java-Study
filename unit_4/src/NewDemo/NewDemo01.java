package NewDemo;

//java1.5�����ԣ��ɱ����
public class NewDemo01 {
	public static void main(String[] args) {
		System.out.println("�����ݲ�����fun()��:");
		fun();
		System.out.println("\n����1��������fun(1)��:");
		fun(1);
		System.out.println("\n����5��������fun(1,2,3,4,5)����");
		fun(1,2,3,4,5);
	}
	public static void fun(int... arg) {	//�ɱ���������Խ�������������
		for(int i = 0;i < arg.length;i++) {
			System.out.println(arg[i] + "��");
		}
		
	}
}
