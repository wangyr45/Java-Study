package DataDemo;

public class DataDemo03 {
	public static void main(String[] args) {
		int max = Integer.MAX_VALUE;	//�������ֵ
		System.out.println("���͵����ֵ��" + max);	//������ֵ
		System.out.println("���͵����ֵ + 1��" + (max + 1)); //���ֵ��1
		System.out.println("���͵����ֵ + 2��" + (max + 2L));	//��Ϊlong��
		System.out.println("���͵����ֵ + 2��" + ((long)max + 2)); //ת��Ϊlong��
		
	}
}
//Ϊ�˱���int��������������ڸñ��ʱ����һ��������ϴ�д��L