package P253PackageDemo;

class Demo{
	public String getInfo() {
		return "Hello World!!!";
	}
}
public class PackageDemo01 {
	public static void main(String[] args) {
		System.out.println(new Demo().getInfo());
	}
}
