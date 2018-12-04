package P215AdapterDemo;

/*
 * ���ģʽ -- ���������
 * 
 * */
interface Window{
	public void open();
	public void close();
	public void activated();
	public void iconified();
	public void deiconified();
}
//���������ӿڣ��ڴ����и�д�������������еķ�����Ϊ�ա�
abstract class WindowAdapter implements Window{
	public void activated() {}
	public void close() {}
	public void deiconifed() {}
	public void iconified() {}
	public void open() {}
}
class WindowImpl extends WindowAdapter{
	public void open() {
		System.out.println("���ڴ򿪡�");
	}
	public void close() {
		System.out.println("���ڹرա�");
	}
	@Override
	public void deiconified() {
		// TODO Auto-generated method stub
		
	}
}
public class AdapterDemo {
	public static void main(String[] args) {
		Window win = new WindowImpl();
		win.open();
		win.close();
	}
}
