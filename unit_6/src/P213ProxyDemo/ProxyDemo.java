package P213ProxyDemo;
/*
 * ���ģʽ --������ģʽ
 * 
 * 
 * */
interface Network{	//����Network�ӿ�
	public void browse();//������������󷽷�
}
class Real implements Network{	//��ʵ����������
	public void browse() {		//��д���󷽷�
		System.out.println("���������Ϣ");
	}
}
class Proxy implements Network{	//��������
	private Network network;
	public Proxy(Network network) {	//���ô������ʵ����
		this.network = network;		//���ô��������
	}
	public void check() {			//�����������صĲ���
		System.out.println("����û��Ƿ�Ϸ�");//������ʵ��������
	}
	public void browse() {
		this.check();
		this.network.browse();
	}
}
public class ProxyDemo {
	public static void main(String[] args) {
		Network net = null;	//����ӿڶ���
		net = new Proxy(new Real());//ʵ��������ͬʱ���������������ʵ����
		net.browse();	//�ͻ�ֻ�����������һ������
	}
}
