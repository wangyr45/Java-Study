package P177InstanceDemo;
//子类对象的实例化过程
class Person{
	private String name;
	private int age;
	public Person() {
		System.out.println("父类Person中的构造。");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

class Student extends Person{
	private String school;
	public Student() {
		System.out.println("子类Student中的构造。");
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}	
}
/*
 * 可以发现子类对象在实例化前会先默认调用父类中的构造方法。就好像没有父亲就没有孩子。
 * 所以在实例化子类对象前需要先将父类中的属性进行初始化。
 * 对于以上代码实际在子类的构造方法中隐含了一个super（）的语法。
 * */
public class InstanceDemo {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("张三");
		stu.setAge(30);
		stu.setSchool("清华大学");
		System.out.println("姓名：" + stu.getAge() + "，年龄：" + stu.getAge()
		+ ",学校：" + stu.getSchool());
	}
}
