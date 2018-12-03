package P206AbstractCaseDemo;
/*
 * 设计模式 -- 工厂设计
 * 
 * 
 * */

interface Fruit{	//定义一个水果的接口
	public void eat();	//吃水果的方法
}
class Apple implements Fruit{	//定义子类Apple
	public void eat() {
		System.out.println("** 吃苹果。");
	}
}
class Orange implements Fruit{	//定义子类Orange
	public void eat() {			//覆写eat()方法
		System.out.println("** 吃橘子。");
	}
}
class Factory{	//定义工厂类
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
		Fruit f = new Apple();	//实例化接口
		f = Factory.getInstance("apple");//通过工厂取得实例
		f.eat();				//调用方法
	}
}
