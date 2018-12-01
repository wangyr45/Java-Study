package ExtDemo;
/*
 * class 父类()	//定义父类
 * class 子类  extends 父类()	//使用extends关键字实现继承
 * 
 * 
 * 1.只允许多层继承，而不能多重继承
 * 比如  class A()
 * 	 class B()
 * 	 class C extends A,B()
 * 
 * 多层继承
 *   class A()
 *   class B extends A()
 *   class C extends B()
 *   
 *
 *继承的子类有时也称为派生类
 * */
class Person{//定义Person类
	private String name;//定义name属性
	private int age;	//定义age属性
	public String getName() {//取得name属性
		return name;
	}
	public void setName(String name) {//设置name属性
		this.name = name;
	}
	public int getAge() {//取得age属性
		return age;
	}
	public void setAge(int age) {//设置age属性
		this.age = age;
	}
	
}
class Student03 extends Person{//Student是Person的子类
	private String school;	//新定义的属性school
	public String getSchool() {//取得school属性
		return school;
	}
	public void setSchool(String School) {//设置school属性
		this.school = school;
	}
}
public class ExtDemo02 {
	public static void main(String[] args) {
		Student03 stu = new Student03();
		stu.setName("张三");	//此时访问的方法是父类中的，子类中并没有定义
		stu.setAge(30);		//此时访问的方法是父类中的，子类中并没有定义
		System.out.println("姓名：" + stu.getName() + "年龄：" + stu.getAge());
	}
}	
