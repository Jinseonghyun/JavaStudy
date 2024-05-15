package extends1.ex;

public class Book extends Item {
    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override                // ctrl + o 하면 오버라이드 단축키
    public void print() {
        super.print();   // 부모꺼 먼저 프린트 하고 내꺼
        System.out.println("- 저자:" + author + ", isbn: " + isbn);
    }
}
