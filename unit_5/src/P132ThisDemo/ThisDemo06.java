package P132ThisDemo;

class Person3{
	public String getInfo() {
		System.out.println("person�� --> " + this);
		return null;
	}
}
public class ThisDemo06 {
	public static void main(String[] args) {
		Person3 per1 = new Person3();
		Person3 per2 = new Person3();
		System.out.println("MAIN���� --> " + per1);
		per1.getInfo();
		System.out.println("-------------------");
		System.out.println("MAIN���� --> " + per2);
		per2.getInfo();
	}
}
