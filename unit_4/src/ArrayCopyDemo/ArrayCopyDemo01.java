package ArrayCopyDemo;

public class ArrayCopyDemo01 {
	public static void main(String[] args) {
		int i1[] = {1,2,3,4,5,6,7,8,9};	//Դ����
		int i2[] = {11,22,33,44,55,66,77,88,99};	//Ŀ������
		copy(i1,3,i2,1,3);	//���ø���
		print(i2);	//�������
	}
	//�������壺Դ�������ơ�Դ���鿪ʼ�㡢Ŀ���������ơ�Ŀ�����鿪ʼ�㡣���Ƴ���
	public static void copy(int s[],int s1, int o[],int s2,int len) 
	{
		for(int i = 0 ;i<len;i++) {
			o[s2 + i] = s[s1 + i];	//�޸�Ŀ����������
		}	
	}
	public static void print(int temp[]) {	//�������
		for(int i = 0 ;i < temp.length;i++) {
			System.out.println(temp[i] + "\t");
		}
	}
}
