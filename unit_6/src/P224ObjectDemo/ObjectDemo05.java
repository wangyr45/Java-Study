package P224ObjectDemo;

public class ObjectDemo05 {
	public static void main(String[] args) {
		int temp[] = {1,3,5,7,9};//��������
		Object obj = temp;		//ʹ��Object��������
		print(obj);				//������������
	}
	public static void print(Object o) {//����һ������
		if(o instanceof int[]) {		//�ж϶��������
			int x[] = (int[])o;			//����ת��
			for(int i=0;i<x.length;i++) {//ѭ�����
				System.out.println(x[i] + "\t");
			}
		}
	}
}
