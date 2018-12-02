package P188AbstractDemo;
/* 目的是为了要设计者依据它的格式来修改并创建新的类，但是不能直接由抽象类创建对象。
 * 只能通过抽象类派生出新的类，在由它来创建对象。
 * 
 * 
 * 抽象类的定义及使用规则如下：
 * 抽象类和抽象方法都要使用abstract关键字声明
 * 抽象方法只需声明而不需要实现
 * 抽象类必须被子继承，子类（如果不是抽象类）必须覆写抽象类中的全部抽象方法
 * 
 * 定义格式：
 * abstract class 抽象类名称{
 * 	属性;
 * 	访问权限 返回值类型 方法名称（参数）{	//普通方法
 * 		{return 返回值};	
 * }
 * 	访问权限 abstract 返回值类型 方法名称（参数）; //抽象方法
 * 	//在抽象方法中是没有方法的
 * }
 * */
abstract class A{
	public static final String FLAG = "CHINA";
	private String name = "小强";
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
		System.out.println("姓名：" + super.getName());
	}
	
}
public class AbstractDemo02 {
	public static void main(String[] args) {
		B b = new B();
		b.print();
	}
}
