package P178OverrideDemo;
//属性分覆写
class Person5{
	public String info = "MLDN";//定义一个公共属性
}
class Student5 extends Person5{//定义一个子类继承Person类
	public String info = "LXH";//此属性与父类中的属性名称一致
	public void print() {
		System.out.println("父类中的属性：" + super.info);//访问父亲中的info属性
		System.out.println("子类中的属性：" + this.info);//访问本类中的info属性
	}

}
public class OverrideDemo05 {
	public static void main(String[] args) {
		new Student5().print();//调用print()方法
	}
}
