package P164LinkDemo;

//单向链表实现
class Node{
	private String data;	//保存节点内容
	private Node next;		//保存下一个节点
	public Node(String data) {//构造方法设置节点内容
		this.data = data;
	}
	public String getData() {//得到节点内容
		return this.data;
	}
	public  void setNext(Node next) {//设置下一个节点
		this.next = next;
	}
	public Node getNext() {	//取得下一个节点
		return this.next;
	}
}
public class LinkDemo01 {	
	public static void main(String[] args) {
		Node root = new Node("火车头");//定义根节点
		Node n1 = new Node("车厢-A");	//定义第一个车厢
		Node n2 = new Node("车厢-B");//定义第二个车厢
		Node n3 = new Node("车厢-C");//定义第三个车厢
		root.setNext(n1);//火车头的下一个节点是第1个车厢
		n1.setNext(n2);//第1个车厢的下一个节点是第2个车厢
		n2.setNext(n3);//第2个车厢的下一个节点的第3个车厢
		printNode(root);//从根节点输出
		
		}
	public static void printNode(Node node) {
		System.out.println(node.getData() + "\t");//输出数据
		if(node.getNext() != null) {	//判断节点是否为空
			printNode(node.getNext());	//继续向下打印
		}
	}
}
