package MethodDemo;

public class MethodDemo02 {
	public static void main(String[] args) {
		int one = addOne(10,20);	//���������ļӷ�����
		float two = addTwo(10.3f,13.3f);	//���ø������ļӷ�����
		System.out.println("addOne�ļ������ǣ�" + one);
		System.out.println("addTwo�ļ������ǣ�" + two);
	}
	//���巽����������������ļӷ���������������һ��int������
	public static int addOne(int x,int y) {
		int temp = 0;	//tempΪ�ֲ�������ֻ�д˷�����Ч
		temp = x + y;
		return temp;
	}
	
	public static float addTwo(float x,float y) {
		float temp = 0;
		temp = x + y;
		return temp;
	}
}
