package MethodDemo;

//��������
public class MethodDemo03 {
	public static void main(String[] args) {
		int one = add(10,20);
		int two = add(10,20,30);
		float three = add(10.3f,13.3f);
		System.out.println("add(int x,int y)�ļ�������" +one);
		System.out.println("add(int x,int y,int z)�ļ�������" + two);
		System.out.println("add(float x,float y)�ļ������ǣ�" + three);
		
	}
	public static int add(int x,int y) {
		int temp = 0;
		temp = x + y;
		return temp;
	}
	public static int add(int x,int y,int z) {
		int temp = 0;
		temp = x + y + z;
		return temp;
	}
	public static float add(float x,float y) {
		float temp = 0;
		temp = x + y;
		return temp;
	}
}
