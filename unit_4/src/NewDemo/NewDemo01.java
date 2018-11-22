package NewDemo;

//java1.5新特性：可变参数
public class NewDemo01 {
	public static void main(String[] args) {
		System.out.println("不传递参数（fun()）:");
		fun();
		System.out.println("\n传递1个参数（fun(1)）:");
		fun(1);
		System.out.println("\n传递5个参数（fun(1,2,3,4,5)）：");
		fun(1,2,3,4,5);
	}
	public static void fun(int... arg) {	//可变参数，可以接受任意多个参数
		for(int i = 0;i < arg.length;i++) {
			System.out.println(arg[i] + "、");
		}
		
	}
}
