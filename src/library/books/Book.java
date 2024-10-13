package library.books;
import java.util.Date;
public class Book {
    private String bookID;
    private String author;
    private String name;
    private double price;
    private boolean status;
    private String edition;
    private Date dateOfPurchase;

    //Constructor
    public Book(String bookID, String author, String name, double price,
                String edition, Date dateOfPurchase){
        this.bookID=bookID;
        this.author=author;
        this.name=name;
        this.price=price;
        this.status=true; //yeni eklenen kitaplar baslangıcta mevcuttur.
        this.edition=edition;
        this.dateOfPurchase=dateOfPurchase;
    }
    public String getTitle(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }
    public void changeOwner(){ //kitabın durumunu odunc verildi olarak update eder.
        this.status=false;
        System.out.println("Kitap ödünç verildi. Durum: Ödünç");
    }
    public void updateStatus(boolean status){ //kitabın mevcut olup olmadığını update eder.
        this.status=status;
        System.out.println("Kitap durumu güncellendi. Mevcut Durum: " + (status ? "Mevcut" : "Ödünç"));
    }
    public boolean isAvailable(){ //kitabın mevcut olup olmadığını döner.
        return status;
    }
    public String getBookID(){
        return bookID;
    }

    @Override
    public String toString() {
        return "Kitap ID: " + bookID + "\n" +
                "Yazar: " + author + "\n" +
                "Başlık: " + name + "\n" +
                "Fiyat: " + price + " TL\n" +
                "Baskı: " + edition + "\n" +
                "Satın Alınma Tarihi: " + dateOfPurchase + "\n" +
                "Durum: " + (status ? "Mevcut" : "Ödünç");
    }
}
