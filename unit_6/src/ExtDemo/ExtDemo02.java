package ExtDemo;
/*
 * class ����()	//���常��
 * class ����  extends ����()	//ʹ��extends�ؼ���ʵ�ּ̳�
 * 
 * 
 * 1.ֻ������̳У������ܶ��ؼ̳�
 * ����  class A()
 * 	 class B()
 * 	 class C extends A,B()
 * 
 * ���̳�
 *   class A()
 *   class B extends A()
 *   class C extends B()
 *   
 *
 *�̳е�������ʱҲ��Ϊ������
 * */
class Person{//����Person��
	private String name;//����name����
	private int age;	//����age����
	public String getName() {//ȡ��name����
		return name;
	}
	public void setName(String name) {//����name����
		this.name = name;
	}
	public int getAge() {//ȡ��age����
		return age;
	}
	public void setAge(int age) {//����age����
		this.age = age;
	}
	
}
class Student03 extends Person{//Student��Person������
	private String school;	//�¶��������school
	public String getSchool() {//ȡ��school����
		return school;
	}
	public void setSchool(String School) {//����school����
		this.school = school;
	}
}
public class ExtDemo02 {
	public static void main(String[] args) {
		Student03 stu = new Student03();
		stu.setName("����");	//��ʱ���ʵķ����Ǹ����еģ������в�û�ж���
		stu.setAge(30);		//��ʱ���ʵķ����Ǹ����еģ������в�û�ж���
		System.out.println("������" + stu.getName() + "���䣺" + stu.getAge());
	}
}	
