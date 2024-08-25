package AbstractClasses;

import java.util.ArrayList;
import java.util.List;

public abstract class Document {

        private String title;
        private String author;

        public Document(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public void displayDetails() {
            System.out.println("Title: " + getTitle());
            System.out.println("Author: " + getAuthor());
        }

        public abstract void open();
        public abstract void close();
        public abstract void print();
    public static void main(String[] args) {
        List<Document> documents = new ArrayList<>();

        documents.add(new PDFDocument("PDF Guide", "Aravind Kumar"));
        documents.add(new TextDocument("Text File", "Balaji"));
        documents.add(new ImageDocument("Image File", "Saravanan"));

        for (Document doc : documents) {
            doc.displayDetails();
            doc.open();
            doc.print();
            doc.close();
            System.out.println();
        }
    }
}
class PDFDocument extends Document {
    public PDFDocument(String title, String author) {
        super(title, author);
    }

    public void open() {
        System.out.println("Opening PDF document: " + getTitle()+".pdf");
    }

    public void close() {
        System.out.println("Closing PDF document: " + getTitle()+".pdf");
    }

    public void print() {
        System.out.println("Printing PDF document: " + getTitle()+".pdf");
    }
}
class ImageDocument extends Document {
    public ImageDocument(String title, String author) {
        super(title, author);
    }

    public void open() {
        System.out.println("Opening Image document: " + getTitle()+".img");
    }

    public void close() {
        System.out.println("Closing Image document: " + getTitle()+".img");
    }

    public void print() {
        System.out.println("Printing Image document: " + getTitle()+".img");
    }
}
class TextDocument extends Document {
    public TextDocument(String title, String author) {
        super(title, author);
    }

    public void open() {
        System.out.println("Opening Text document: " + getTitle()+".txt");
    }


    public void close() {
        System.out.println("Closing Text document: " + getTitle()+".txt");
    }


    public void print() {
        System.out.println("Printing Text document: " + getTitle()+"txt");
    }
}
