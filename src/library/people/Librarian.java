package library.people;

import library.books.Book; // Book sınıfını kullanmak için içe aktarıyoruz.
import library.system.Library; // Library sınıfını kullanmak için içe aktarıyoruz.

public class Librarian extends Person { // Librarian sınıfı, Person sınıfından extend edilir.
    // Librarian nesnesi oluşturmak için bir constructor tanımlıyoruz.
    public Librarian(String name, String id) {
        super(name, id); // Person sınıfının constructor'ına isim ve ID gönderir.
    }

    // Kütüphaneye kitap eklemek için kullanılan metod
    public void addBook(Library library, Book book) { // Parametre olarak Library ve Book nesneleri alır.
        library.addBook(book); // Belirtilen kütüphaneye kitabı ekler.
    }

    // Kütüphaneden kitap silmek için kullanılan metod
    public void removeBook(Library library, String bookId) { // Parametre olarak Library ve kitap ID'si alır.
        library.removeBook(bookId); // Belirtilen ID'ye sahip kitabı kütüphaneden siler.
    }
}
