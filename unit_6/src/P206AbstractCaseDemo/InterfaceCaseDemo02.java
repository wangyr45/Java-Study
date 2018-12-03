package P206AbstractCaseDemo;

/*
 * 
 * �ӿڵ�ʵ��Ӧ�� ---���ƶ���׼
 * 
 * */
interface USB{
	public void start();
	public void stop();
}
class Computer{
	public static void plugin(USB usb) {
		usb.start();
		System.out.println("=====USB �豸����======");
		usb.stop();
	}
}
class Flash implements USB{
	public void start() {
		System.out.println("U�̿�ʼ������");
	}
	public void stop() {
		System.out.println("U��ֹͣ������");
	}
}
class Print implements USB{
	public void start() {
		System.out.println("��ӡ����ʼ������");
	}
	public void stop() {
		System.out.println("��ӡ��ֹͣ������");
	}
}
public class InterfaceCaseDemo02 {
	public static void main(String[] args) {
		Computer.plugin(new Flash());//����U��
		Computer.plugin(new Print());//�����ӡ��
		
	}
}
