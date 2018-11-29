package P140StaticDemo;

class Demo02{
	private String name;
	private static int count = 0;
	public Demo02() {
		count++;
		this.name = "DEMO-" + count;
	}
	public Demo02(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
public class StaticDemo07 {
	public static void main(String[] args) {
		System.out.println(new Demo02().getName());
		System.out.println(new Demo02("LXH").getName());
		System.out.println(new Demo02().getName());
		System.out.println(new Demo02("MLDN").getName());
		System.out.println(new Demo02().getName());
		
	}
}
