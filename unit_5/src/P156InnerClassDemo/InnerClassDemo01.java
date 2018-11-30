package P156InnerClassDemo;

class Outer{
	private String info = "hello world!";
	public String getInfo() {	//ȡ��˽������
		return this.info;
	}
	public void fun() {
		new Inner(this).print();	//����ǰ���󴫵ݵ�Inner��
	}
}

class Inner{
	private Outer out = null;	//�����ⲿ�����
	public Inner(Outer out) {	//�����ⲿ�����ʵ��
		this.out = out;
	}
	public void print() {	//��ӡ�ⲿ���˽������
		System.out.println(out.getInfo());
	}
}
public class InnerClassDemo01 {
	public static void main(String[] args) {	//����Outer���fun()
		new Outer().fun();
	}
}
