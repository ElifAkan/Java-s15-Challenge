package library.books;

import java.util.Date;

public class StudyBooks extends Book {
    private String subject; // Dersin konusu

    // Constructor
    public StudyBooks(String bookID, String author, String name, double price, String edition, Date dateOfPurchase, String subject) {
        super(bookID, author, name, price, edition, dateOfPurchase);
        this.subject = subject; // Ders konusunu alır
    }

    public String getSubject() {
        return subject; // Ders konusunu döner
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + // Book sınıfının toString() metodunu çağırır
                "Konu: " + subject; // Ders konusunu ekler
    }
}
