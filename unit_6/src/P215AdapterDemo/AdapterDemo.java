package P215AdapterDemo;

/*
 * 设计模式 -- 适配器设计
 * 
 * */
interface Window{
	public void open();
	public void close();
	public void activated();
	public void iconified();
	public void deiconified();
}
//定义抽象类接口，在此类中覆写方法，但是所有的方法体为空。
abstract class WindowAdapter implements Window{
	public void activated() {}
	public void close() {}
	public void deiconifed() {}
	public void iconified() {}
	public void open() {}
}
class WindowImpl extends WindowAdapter{
	public void open() {
		System.out.println("窗口打开。");
	}
	public void close() {
		System.out.println("窗口关闭。");
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
