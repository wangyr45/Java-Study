package ArrayDemo;

public class ArrayDemo07 {
	public static void main(String[] args) {
		int score[] = {67,89,77,69,90,100,75,90};	//��������
		for(int i = 1;i<score.length;i++) {			//ѭ���ж�
			for(int j = 0;j<score.length;j++) {
				if(score[i]<score[j]) {				//����λ��
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
			System.out.println("��"+i+"������Ľ����\t");
			for(int j = 0;j<score.length;j++) {		//ѭ�����
				System.out.println(score[j] + "\t");
			}
			System.out.println("");		//����
		}
		System.out.println("���յ�������Ϊ��\t");
		for(int i = 0;i<score.length;i++) {
			System.out.println(score[i] + "\t");
		}
	}
}
