package P140StaticDemo;


public class StaticDemo08 {
	public static void main(String[] args) {
		if(args.length != 3) {	//���е����������������args����֮��
			System.out.println("��������ĸ�������3���������˳�-");	//�������㣬������˳�
			System.exit(1);	//ֱ���˳�������
		}
		for(int x = 0; x < args.length; x++) { 	//���������ȷ����ȫ�������ݴ�ӡ����
			System.out.println("��" + (x + 1) + "��������" + args[x]);
		}
	}
	
}
