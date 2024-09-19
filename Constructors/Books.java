package Constructors;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private String title;
    private String author;
    private String ISBN;
    private int publicationYear;
    private double price;

    private static int bookCount = 0;

    public Books(String title, String author, String ISBN, int publicationYear, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
        bookCount++;


    }


    public static int getBookCount() {
        return bookCount;
    }

    @Override
    public String toString() {
        return "BookDTO [Title=" + title + ", Author=" + author + ", ISBN=" + ISBN +
                ", Publication Year=" + publicationYear + ", Price=" + price + "]";
    }


    public static void addAndDisplayBooks() {
        List<Books> books = new ArrayList<Books>();

        books.add(new Books("Effective Java", "Joshua Bloch", "978-0134685991", 2018, 45.00));
        books.add(new Books("Clean Code", "Robert C. Martin", "978-0132350884", 2008, 40.00));
        books.add(new Books("Design Patterns", "Erich Gamma", "978-0201633610", 1994, 54.95));
        displayBooks(books);
    }
    public static void displayBooks(List<Books> books){
        // Display all the books added
        for (Books book : books) {
            System.out.println(book);
        }

        // Print the number of books created
        System.out.println("Total number of books created: " + Books.getBookCount());
    }

    public static void main(String[] args) {
        addAndDisplayBooks();
    }
}
