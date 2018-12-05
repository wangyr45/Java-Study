package P224ObjectDemo;

public class ObjectDemo05 {
	public static void main(String[] args) {
		int temp[] = {1,3,5,7,9};//定义数组
		Object obj = temp;		//使用Object接受数组
		print(obj);				//传递数组引用
	}
	public static void print(Object o) {//接收一个对象
		if(o instanceof int[]) {		//判断对象的类型
			int x[] = (int[])o;			//向下转型
			for(int i=0;i<x.length;i++) {//循环输出
				System.out.println(x[i] + "\t");
			}
		}
	}
}
