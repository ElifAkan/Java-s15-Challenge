import library.books.Book;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
            // Kitap nesnesini oluşturun
            Book book = new Book("12345", "George Orwell", "1984", 29.99, "First Edition", new Date());

            // Kitap bilgilerini göster
            System.out.println(book);

            // Kitabı ödünç ver
            book.changeOwner(); // "Kitap ödünç verildi. Durum: Ödünç" yazdırır

            // Kitap durumunu kontrol et
            System.out.println("Durum: " + (book.isAvailable() ? "Mevcut" : "Ödünç")); // Mevcut durumu kontrol et

            // Kitap bilgilerini tekrar göster
            System.out.println(book);
        }
    }
