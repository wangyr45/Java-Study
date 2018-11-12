package MethodDemo;

public class MethodDemo01 {
	public static void main(String[] args) {
		printInfo();
		printInfo();
		printInfo();
		System.out.println("Hello World!");
}


public static void printInfo() {
	char c[] = {'H','e','l','l','o',',','L','X','H'};
	for(int x = 0; x < c.length;x++) {
		System.out.println(c[x]);
		}
		System.out.println("");
	}
}
