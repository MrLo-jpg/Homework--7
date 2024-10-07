import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Война и мир", 1869, new Author("Лев", "Толстой"));

        System.out.println(book.getNameBook());
        System.out.println(book.getYearPublication());
        System.out.println(book.getAuthor());
        book.setYearPublication(1870);
        System.out.println(book.getYearPublication());


        System.out.println(Objects.hash());


        Book book1 = new Book("Мёртвые души", 1842, new Author("Николай", "Гоголь"));

        System.out.println(book1.getNameBook());
        System.out.println(book1.getYearPublication());
        System.out.println(book1.getAuthor());
        System.out.println(book);
        System.out.println(book1);


    }
}