package library.system;

import library.books.Book;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Kitap eklendi: " + book.getTitle());
    }

    public void removeBook(String bookID) {
        Book bookToRemove = findBookByID(bookID);
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Kitap silindi: " + bookToRemove.getTitle());
        } else {
            System.out.println("Kitap bulunamadı: " + bookID);
        }
    }

    public void updateBook(String bookID, String author, String name, double price, String edition) {
        Book book = findBookByID(bookID);
        if (book != null) {
            book.setAuthor(author);
            book.setName(name);
            book.setPrice(price);
            book.setEdition(edition);
            System.out.println("Kitap güncellendi: " + book.getTitle());
        } else {
            System.out.println("Kitap bulunamadı: " + bookID);
        }
    }

    public Book findBookByID(String bookID) {
        for (Book book : books) {
            if (book.getBookID().equals(bookID)) {
                return book;
            }
        }
        return null;
    }

    public boolean isBookAvailable(String bookID) {
        Book book = findBookByID(bookID);
        return book != null && book.isAvailable();
    }

    public void updateBookStatus(String bookID, boolean status) {
        Book book = findBookByID(bookID);
        if (book != null) {
            book.updateStatus(status);
        } else {
            System.out.println("Kitap bulunamadı: " + bookID);
        }
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("Kütüphanede hiç kitap yok.");
        } else {
            System.out.println("Kütüphanedeki Kitaplar:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}