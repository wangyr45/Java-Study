package P140StaticDemo;


public class StaticDemo08 {
	public static void main(String[] args) {
		if(args.length != 3) {	//所有的输入参数都保存在args数组之中
			System.out.println("输入参数的个数不足3个，程序退出-");	//参数不足，则程序退出
			System.exit(1);	//直接退出本程序
		}
		for(int x = 0; x < args.length; x++) { 	//输入参数正确，则将全部的内容打印出来
			System.out.println("第" + (x + 1) + "个参数：" + args[x]);
		}
	}
	
}
