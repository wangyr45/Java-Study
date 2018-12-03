package P206AbstractCaseDemo;
/*
 * ���ģʽ -- �������
 * 
 * 
 * */

interface Fruit{	//����һ��ˮ���Ľӿ�
	public void eat();	//��ˮ���ķ���
}
class Apple implements Fruit{	//��������Apple
	public void eat() {
		System.out.println("** ��ƻ����");
	}
}
class Orange implements Fruit{	//��������Orange
	public void eat() {			//��дeat()����
		System.out.println("** �����ӡ�");
	}
}
class Factory{	//���幤����
	public static Fruit getInstance(String className) {
		Fruit f = null;
		if("apple".equals(className)) {
			f = new Apple();
		}
		if("orange".equals(className)) {
			f = new Orange();
		}
		return f;
	}
}
public class InterfaceCaseDemo03 {
	public static void main(String[] args) {
		Fruit f = new Apple();	//ʵ�����ӿ�
		f = Factory.getInstance("apple");//ͨ������ȡ��ʵ��
		f.eat();				//���÷���
	}
}
