package P178OverrideDemo;
//���Էָ�д
class Person5{
	public String info = "MLDN";//����һ����������
}
class Student5 extends Person5{//����һ������̳�Person��
	public String info = "LXH";//�������븸���е���������һ��
	public void print() {
		System.out.println("�����е����ԣ�" + super.info);//���ʸ����е�info����
		System.out.println("�����е����ԣ�" + this.info);//���ʱ����е�info����
	}

}
public class OverrideDemo05 {
	public static void main(String[] args) {
		new Student5().print();//����print()����
	}
}
