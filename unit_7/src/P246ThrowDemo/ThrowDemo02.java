package P246ThrowDemo;

class Math{
	public int div(int i , int j) throws Exception{
		System.out.println("���㿪ʼ");
		int temp = 0;
		try {
			temp = i / j;
		} catch (Exception e) {
			throw e;
		}finally {
			System.out.println("�������");
		}
		return temp;
	}
}
public class ThrowDemo02 {
	public static void main(String[] args) {
		Math m = new Math();
		try {
			System.out.println("����������" + m.div(10, 0));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�쳣������" + e);
		}
	}
}
