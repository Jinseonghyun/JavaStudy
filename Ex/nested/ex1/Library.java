package nested.ex1;

public class Library {
	private Book[] books;
	private int bookCount;
	
	public Library(int size) {
		books = new Book[size];
		bookCount = 0;
	}
	
	public void addBook(String title,String author) {
		if (bookCount < books.length) {
			books[bookCount++] = new Book(title, author);
		} else {
			System.out.println("������ ���� ������ �����մϴ�.");
		}
	}
	
	public void showBooks() {
		System.out.println("== å ��� ��� ==");
		for (int i = 0; i < bookCount; i++) {
			System.out.println("���� ����: " + books[i].title + ",����:" + books[i].author);
		}
	}
	
	private static class Book {
		private String title;
		private String author;
		
		public Book(String title, String author) {
			this.title = title;
			this.author = author;
		}
		
	}
}
