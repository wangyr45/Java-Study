package ExampleDemo;

public class ExampleDemo01 {
	public static void main(String[] args) {
		Student stu = null; //��������
		stu = new Student("MLDN-33","����",95.0f,89.0f,96.0f);
		System.out.println("ѧ����ţ�" + stu.getStuno());
		System.out.println("ѧ��������" + stu.getName());
		System.out.println("��ѧ�ɼ���" + stu.getMath());
		System.out.println("Ӣ��ɼ���" + stu.getEnglish());
		System.out.println("������ɼ���" + stu.getComputer());
		System.out.println("��߷֣�" + stu.max());
		System.out.println("��ͷ֣�" + stu.min());
		
	}
}	
