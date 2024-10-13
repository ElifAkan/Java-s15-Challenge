package library.books;

import java.util.Date;

public class Journals extends Book {
    private String journalType; // Dergi türü (örneğin: bilimsel, popüler)

    // Constructor
    public Journals(String bookID, String author, String name, double price, String edition, Date dateOfPurchase, String journalType) {
        super(bookID, author, name, price, edition, dateOfPurchase);
        this.journalType = journalType; // Dergi türünü alır
    }

    public String getJournalType() {
        return journalType; // Dergi türünü döner
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + // Book sınıfının toString() metodunu çağırır
                "Dergi Türü: " + journalType; // Dergi türünü ekler
    }
}
