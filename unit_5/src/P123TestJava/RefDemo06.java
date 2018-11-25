package P123TestJava;

class Person {
	private String name;
	private int age;	
	private Book book;
	private Person child;
	public Person(String name, int age) {	//ͨ��������������
		this.setName(name);
		this.setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Person getChild() {
		return child;
	}
	public void setChild(Person child) {
		this.child = child;
	}
	
}


class Book {
	private String title;
	private float price;
	private Person person;
	public Book(String title, float price) {
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
public class RefDemo06 {
	public static void main(String[] args) {
		Person per = new Person("����",30);
		Person cld = new Person("����", 10);
		Book bk = new Book("JAVA SE���Ŀ���", 90.0f);
		Book b = new Book("ʮ���Ϊʲô",30.3f);
		per.setBook(bk);
		bk.setPerson(per);
		cld.setBook(b);
		b.setPerson(cld);
		per.setChild(cld);
		System.out.println("�����ҵ���-->������" + per.getName()
		+ ":���䣺" + per.getAge()+ ":������" + per.getBook().getTitle() 
		+ ":�۸�" + per.getBook().getPrice());
		System.out.println("�����ҵ���-->������" + per.getBook().getTitle()
				+ ":�۸�" + per.getBook().getPrice() 
				+ ":������" + per.getName()
				+ ":���䣺" + per.getAge());
		System.out.println(per.getName() + "�ĺ��� --> ������"
				+ per.getChild().getName() 
				+ ":���䣺" + per.getChild().getAge()
				+ ":������" + per.getChild().getBook().getTitle()
				+ ":�۸�" + per.getChild().getBook().getPrice());
	}
	
}