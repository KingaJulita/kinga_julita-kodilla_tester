public class Book {

    public String author;
    public String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;

    }
    public static Book of(String author, String title) {
        return new Book(author, title);
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        Book book = Book.of("Henryk Sienkiewicz", "Ogniem i mieczem");
        System.out.println("Autorem książki " + book.getTitle() + " jest " + book.getAuthor());
    }
}
