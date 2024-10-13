package library.books;

import java.util.Date;

public class Magazines extends Book {
    private String issueNumber; // Dergi sayısı

    // Constructor
    public Magazines(String bookID, String author, String name, double price, String edition, Date dateOfPurchase, String issueNumber) {
        super(bookID, author, name, price, edition, dateOfPurchase);
        this.issueNumber = issueNumber; // Dergi sayısını alır
    }

    public String getIssueNumber() {
        return issueNumber; // Dergi sayısını döner
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + // Book sınıfının toString() metodunu çağırır
                "Dergi Sayısı: " + issueNumber; // Dergi sayısını ekler
    }
}