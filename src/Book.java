public class Book {
    private String nameBook;
    private int yearPublication;
   private Author author;

    public String getNameBook() {
        return nameBook;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public Author getAuthor() {
        return author;
    }


    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public Book(String nameBook, int yearPublication, Author author) {
        this.nameBook = nameBook;
        this.yearPublication = yearPublication;
        this.author = author;



    }
}


