package P184ArrayDemo;

class Array{
	private int temp[];
	private int foot;
	public Array(int len) {
		if(len > 0) {
			this.temp = new int[len];
		}else {
			this.temp = new int[1];
		}
	}
	public boolean add(int i) {
		if(this.foot < this.temp.length) {
			this.temp[foot] = i;
			foot++;
			return true;
		}else {
			return false;
		}
	}
	public int[] getArray() {
		return this.temp;
	}
}
public class ArrayDemo01 {
	public static void main(String[] args) {
		ReverseArray a = null;
		a = new ReverseArray(5);
		System.out.println(a.add(23) + "\t");
		System.out.println(a.add(21) + "\t");
		System.out.println(a.add(2) + "\t");
		System.out.println(a.add(42) + "\t");
		System.out.println(a.add(5) + "\t");
		System.out.println(a.add(6) + "\t");
		print(a.getArray());
	}
	public static void print(int i[]) {
		for(int x = 0; x < i.length; x++) {
			System.out.println(i[x] + "¡¢");
		}
	}
}
