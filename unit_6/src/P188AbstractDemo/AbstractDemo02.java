package P188AbstractDemo;
/* Ŀ����Ϊ��Ҫ������������ĸ�ʽ���޸Ĳ������µ��࣬���ǲ���ֱ���ɳ����ഴ������
 * ֻ��ͨ���������������µ��࣬����������������
 * 
 * 
 * ������Ķ��弰ʹ�ù������£�
 * ������ͳ��󷽷���Ҫʹ��abstract�ؼ�������
 * ���󷽷�ֻ������������Ҫʵ��
 * ��������뱻�Ӽ̳У����ࣨ������ǳ����ࣩ���븲д�������е�ȫ�����󷽷�
 * 
 * �����ʽ��
 * abstract class ����������{
 * 	����;
 * 	����Ȩ�� ����ֵ���� �������ƣ�������{	//��ͨ����
 * 		{return ����ֵ};	
 * }
 * 	����Ȩ�� abstract ����ֵ���� �������ƣ�������; //���󷽷�
 * 	//�ڳ��󷽷�����û�з�����
 * }
 * */
abstract class A{
	public static final String FLAG = "CHINA";
	private String name = "Сǿ";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void print();
}
class B extends A{
	public void print() {
		System.out.println("FLAG = " + FLAG);
		System.out.println("������" + super.getName());
	}
	
}
public class AbstractDemo02 {
	public static void main(String[] args) {
		B b = new B();
		b.print();
	}
}
