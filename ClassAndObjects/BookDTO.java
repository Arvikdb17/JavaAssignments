package ClassAndObjects;

public class BookDTO {
    private String title;
    private String author;
    private String ISBN;
    private int publicationYear;
    private double price;

    private static int bookCount = 0;

    public BookDTO(String title, String author, String ISBN, int publicationYear, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
        this.price = price;
        bookCount++;
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getBookCount() {
        return bookCount;
    }

    @Override
    public String toString() {
        return "BookDTO [Title=" + title + ", Author=" + author + ", ISBN=" + ISBN +
                ", Publication Year=" + publicationYear + ", Price=" + price + "]";
    }
    public static void main(String[] args) {

        BookDTO book1 = new BookDTO("Effective Java", "Joshua Bloch", "978-0134685991", 2018, 45.00);
        BookDTO book2 = new BookDTO("Clean Code", "Robert C. Martin", "978-0132350884", 2008, 40.00);
        BookDTO book3 = new BookDTO("Design Patterns", "Erich Gamma", "978-0201633610", 1994, 54.95);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);


        System.out.println("Total number of books created: " + BookDTO.getBookCount());
    }
}
