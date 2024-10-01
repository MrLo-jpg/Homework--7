public class Main {
    public static void main(String[] args) {
        Book book = new Book("Война и мир", 1869, new Author("Лев", "Толстой"));

        System.out.println(book.getNameBook());
        System.out.println(book.getYearPublication());
        System.out.println(book.getAuthor());
        book.setYearPublication(1870);
        System.out.println(book.getYearPublication());

        Author author = new Author("Лев", "Толстой");
        System.out.println(author.getFirstName());
        System.out.println(author.getFirstName());

        Book book1 = new Book("Мёртвые души", 1842, new Author("Николай", "Гоголь")
        );

        System.out.println(book1.getNameBook());
        System.out.println(book1.getYearPublication());


        Author author1 = new Author("Николай", "Гоголь");
        System.out.println(author1.getFirstName());
        System.out.println(author1.getLastName());

    }
}