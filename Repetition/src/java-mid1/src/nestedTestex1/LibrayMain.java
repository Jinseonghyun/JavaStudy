package nestedTestex1;

public class LibrayMain {

	public static void main(String[] args) {
		Library libray = new Library(4);
		libray.addBook("책1", "저자1");
		libray.addBook("책2", "저자2");
		libray.addBook("책3", "저자3");
		libray.addBook("자바 ORM 표준 JPA 프로그래밍", "진성현");
		libray.addBook("OneMoreThing", "잡스");
		libray.showBooks();
	}

}
