package P164LinkDemo;

class Link{
	class Node{	//�ѽڵ��ඨ����ڲ���
		private String data;
		private Node next;
		public Node(String data) {
			this.data = data;
		}
		public void add(Node newNode) {	//����һ��add����
			if(this.next == null) {	//�ж���һ���ڵ��Ƿ�Ϊ��
				this.next =  newNode;	//�����һ���ڵ�Ϊ�գ�����½ڵ�������nextλ����
			}
			else {	//�����Ϊ�գ����ʾ������һ���ڵ�
				this.next.add(newNode);//����һ��λ�ô�����
			}
		}
		public void print() {
			System.out.println(this.data + "\t");
			if(this.next != null) {	//�����һ���ڵ㲻Ϊ�գ��������ӡ
				this.next.print();	//����һ���ڵ����
			}
		}
		public boolean search(String data) {//�ڲ�������������
			if(data.equals(this.data)) {	//�жϵ�ǰ�ڵ�������Ƿ�����ҵ�һ��
				return true;	//���һ�£��򷵻�true
			}else {	//�����ж���һ��
				if(this.next != null) {	//��һ���ڵ���ڣ����������
					return this.next.search(data);	//������һ���Ĳ�ѯ���
				}else {
					return false;	//�ڵ㲻���ڣ�����false
				}
			}
		}
		public void delete(Node previous, String data) {	//ɾ���ڵ�
			if(data.equals(this.data)) {	//�ҵ���ƥ��ڵ�
				previous.next = this.next;	//�ճ���ǰ�ڵ�
			}else {
				if(this.next != null) {
					this.next.delete(this, data);	//����������
				}
			}
		}
	}
	private Node root;	//��ʾ���ڵ�
	public void addNode(String data) {	//���ӽڵ�ķ���
		Node newNode = new Node(data);	//����һ���µĽڵ�
		if(this.root == null) {	//û�и��ڵ�
			this.root = newNode;	//����һ���ڵ����óɸ��ڵ�
		}else {
			this.root.add(newNode);	//��ӵ����ʵ�λ��
		}
	}
	public void printNode() {	//��ӡȫ���Ľڵ�
		if(this.root != null) {	//�ж��Ƿ���ڸ��ڵ�
			this.root.print();
		}
	}
	public boolean contains(String name) {	//�ж�Ԫ���Ƿ����
		return this.root.search(name);	//����Node���е�search()����
	}
	public void deleteNode(String data) {	//ɾ���ڵ�
		if(this.contains(data)) {	//����ڵ���ڣ���ִ��ɾ������
			if(this.root.data.equals(data)) {	//�жϸ��ڵ��Ƿ�����Ҫ��
				this.root = this.root.next;	//�����ڵ�֮����������óɸ��ڵ�
			}else {
				this.root.next.delete(root, data);	//ɾ���ڵ�
			}
		}
	}
}
public class LinkDemo02 {
	public static void main(String[] args) {
		Link l = new Link();
		l.addNode("A");//���ӽڵ�
		l.addNode("B");//���ӽڵ�
		l.addNode("C");//���ӽڵ�
		l.addNode("D");//���ӽڵ�
		l.addNode("E");//���ӽڵ�
		System.out.println("====ɾ��֮ǰ====");
		l.printNode();	//����ڵ�
		l.deleteNode("C");//ɾ���ڵ�
		l.deleteNode("D");//ɾ���ڵ�
		System.out.println();
		System.out.println("====ɾ��֮��====");
		l.printNode();
		System.out.println();
		System.out.println("��ѯ�ڵ㣺" + l.contains("A"));
	}
}
