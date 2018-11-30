package P164LinkDemo;

class Link{
	class Node{	//把节点类定义成内部类
		private String data;
		private Node next;
		public Node(String data) {
			this.data = data;
		}
		public void add(Node newNode) {	//增加一个add操作
			if(this.next == null) {	//判断下一个节点是否为空
				this.next =  newNode;	//如果下一个节点为空，则把新节点设置在next位置上
			}
			else {	//如果不为空，则表示还有下一个节点
				this.next.add(newNode);//在下一个位置处增加
			}
		}
		public void print() {
			System.out.println(this.data + "\t");
			if(this.next != null) {	//如果下一个节点不为空，则继续打印
				this.next.print();	//让下一个节点输出
			}
		}
		public boolean search(String data) {//内部定义搜索方法
			if(data.equals(this.data)) {	//判断当前节点的名字是否与查找的一致
				return true;	//如果一致，则返回true
			}else {	//继续判断下一个
				if(this.next != null) {	//下一个节点存在，则继续查找
					return this.next.search(data);	//返回下一个的查询结果
				}else {
					return false;	//节点不存在，返回false
				}
			}
		}
		public void delete(Node previous, String data) {	//删除节点
			if(data.equals(this.data)) {	//找到了匹配节点
				previous.next = this.next;	//空出当前节点
			}else {
				if(this.next != null) {
					this.next.delete(this, data);	//继续向下找
				}
			}
		}
	}
	private Node root;	//表示根节点
	public void addNode(String data) {	//增加节点的方法
		Node newNode = new Node(data);	//建立一个新的节点
		if(this.root == null) {	//没有根节点
			this.root = newNode;	//降低一个节点设置成根节点
		}else {
			this.root.add(newNode);	//添加到合适的位置
		}
	}
	public void printNode() {	//打印全部的节点
		if(this.root != null) {	//判断是否存在根节点
			this.root.print();
		}
	}
	public boolean contains(String name) {	//判断元素是否存在
		return this.root.search(name);	//调用Node类中的search()方法
	}
	public void deleteNode(String data) {	//删除节点
		if(this.contains(data)) {	//如果节点存在，则执行删除操作
			if(this.root.data.equals(data)) {	//判断根节点是否满足要求
				this.root = this.root.next;	//将根节点之后的内容设置成根节点
			}else {
				this.root.next.delete(root, data);	//删除节点
			}
		}
	}
}
public class LinkDemo02 {
	public static void main(String[] args) {
		Link l = new Link();
		l.addNode("A");//增加节点
		l.addNode("B");//增加节点
		l.addNode("C");//增加节点
		l.addNode("D");//增加节点
		l.addNode("E");//增加节点
		System.out.println("====删除之前====");
		l.printNode();	//输出节点
		l.deleteNode("C");//删除节点
		l.deleteNode("D");//删除节点
		System.out.println();
		System.out.println("====删除之后====");
		l.printNode();
		System.out.println();
		System.out.println("查询节点：" + l.contains("A"));
	}
}
