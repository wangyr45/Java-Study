package P272RunnableDemo;
class MyThread implements Runnable{		//实现Runnable接口
	private String name;				//在类中定义一个属性
	public MyThread(String name) {		//通过构造方法设置属性内容
		this.name = name;				//为name属性赋值
	}
	public void run() {					//覆写Runnable接口中的run()方法
		for(int i = 0; i < 10; i++) {
			System.out.println(name + "运行，i=" + i);
		}
	}
};
public class RunnableDemo01 {
	public static void main(String[] args) {
		MyThread my1 = new MyThread("线程A");//实例化Runnable子类对象
		MyThread my2 = new MyThread("线程B");//实例化Runnable子类对象
		Thread t1 = new Thread(my1);	//实例化Thread类对象
		Thread t2 = new Thread(my2);	//实例化Thread类对象
		t1.start();						//启动线程
		t2.start();						//启动线程
		
	}
}
