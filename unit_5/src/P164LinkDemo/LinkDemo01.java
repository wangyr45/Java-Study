package P164LinkDemo;

//��������ʵ��
class Node{
	private String data;	//����ڵ�����
	private Node next;		//������һ���ڵ�
	public Node(String data) {//���췽�����ýڵ�����
		this.data = data;
	}
	public String getData() {//�õ��ڵ�����
		return this.data;
	}
	public  void setNext(Node next) {//������һ���ڵ�
		this.next = next;
	}
	public Node getNext() {	//ȡ����һ���ڵ�
		return this.next;
	}
}
public class LinkDemo01 {	
	public static void main(String[] args) {
		Node root = new Node("��ͷ");//������ڵ�
		Node n1 = new Node("����-A");	//�����һ������
		Node n2 = new Node("����-B");//����ڶ�������
		Node n3 = new Node("����-C");//�������������
		root.setNext(n1);//��ͷ����һ���ڵ��ǵ�1������
		n1.setNext(n2);//��1���������һ���ڵ��ǵ�2������
		n2.setNext(n3);//��2���������һ���ڵ�ĵ�3������
		printNode(root);//�Ӹ��ڵ����
		
		}
	public static void printNode(Node node) {
		System.out.println(node.getData() + "\t");//�������
		if(node.getNext() != null) {	//�жϽڵ��Ƿ�Ϊ��
			printNode(node.getNext());	//�������´�ӡ
		}
	}
}
