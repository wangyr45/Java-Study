package P123TestJava;

//���ô��ݼ�����Ӧ��
class Demo{
	String temp = "hello";	//�˴�Ϊ�˷��ʷ��㣬������ʱ����װ
}
public class TestJava0538 {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.temp = "world";
		System.out.println("fun()��������֮ǰ��" + d1.temp);
		fun(d1);
		System.out.println("fun()��������֮��" + d1.temp);
	}
	public static void fun(Demo d2) {	//�˴�������������ֱ�ӵ���
		d2.temp = "MLDN";
	}
}
