package P246ThrowDemo;

public class ThrowDemo01 {
	public static void main(String[] args) {
		try {
			throw new Exception("自己抛出的异常！");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
