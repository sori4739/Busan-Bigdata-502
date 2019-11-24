package ex04;

class Book {
	private String title;
	private String author;
	
	public Book() {
		this("���� ����");
	}
	
	public Book(String title) {
		this.title = title;
		this.author = "���� �̻�";	
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}	
	
	
}

public class BookApp {


	
	
	public static void main(String[] args) {
		Book b1 = new Book();
		System.out.println(b1.getTitle());
		System.out.println(b1.getAuthor());
		System.out.println();
		
		Book b2 = new Book("������");
		System.out.println(b2.getTitle());
		System.out.println(b2.getAuthor());
		System.out.println();
		
		Book b3 = new Book("�����","�������丮");
		System.out.println(b3.getTitle());
		System.out.println(b3.getAuthor());
		System.out.println();
		
	}
 }

