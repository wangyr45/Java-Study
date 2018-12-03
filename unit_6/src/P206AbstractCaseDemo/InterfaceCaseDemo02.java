package P206AbstractCaseDemo;

/*
 * 
 * 接口的实际应用 ---》制定标准
 * 
 * */
interface USB{
	public void start();
	public void stop();
}
class Computer{
	public static void plugin(USB usb) {
		usb.start();
		System.out.println("=====USB 设备工作======");
		usb.stop();
	}
}
class Flash implements USB{
	public void start() {
		System.out.println("U盘开始工作。");
	}
	public void stop() {
		System.out.println("U盘停止工作。");
	}
}
class Print implements USB{
	public void start() {
		System.out.println("打印机开始工作。");
	}
	public void stop() {
		System.out.println("打印机停止工作。");
	}
}
public class InterfaceCaseDemo02 {
	public static void main(String[] args) {
		Computer.plugin(new Flash());//插入U盘
		Computer.plugin(new Print());//插入打印机
		
	}
}
