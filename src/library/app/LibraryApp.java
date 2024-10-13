package library.app;

import library.people.Reader;
import library.system.Library;
import library.books.Book; // Burayı ekledik

import java.util.Date;
import java.util.Scanner;

public class LibraryApp {
    private static Library library = new Library(); // Kütüphane nesnesi
    private static Reader reader = new Reader("Ali", "123"); // Örnek bir kullanıcı (Reader)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Ana Menü");
            System.out.println("1. Yeni kitap ekle");
            System.out.println("2. Kitap sil");
            System.out.println("3. Kitap bilgilerini güncelle");
            System.out.println("4. Kitapları listele");
            System.out.println("5. Kitap ödünç al");
            System.out.println("6. Kitap iade et");
            System.out.println("7. Çıkış");
            System.out.print("Seçiminizi yapın (1-7): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Satır başını temizle

            switch (choice) {
                case 1:
                    addNewBook(scanner);
                    break;
                case 2:
                    removeBook(scanner);
                    break;
                case 3:
                    updateBookInfo(scanner);
                    break;
                case 4:
                    listBooks();
                    break;
                case 5:
                    borrowBook(scanner);
                    break;
                case 6:
                    returnBook(scanner);
                    break;
                case 7:
                    exit = true; // Çıkış yapılır
                    break;
                default:
                    System.out.println("Geçersiz seçim! Tekrar deneyin.");
            }
        }
        scanner.close();
    }

    private static void addNewBook(Scanner scanner) {
        System.out.println("Yazar: ");
        String author = scanner.nextLine();
        System.out.println("Başlık: ");
        String name = scanner.nextLine();
        System.out.println("Fiyat: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Satır başını temizle
        System.out.println("Baskı: ");
        String edition = scanner.nextLine();

        // Kitap ID'sini kullanıcıdan al
        System.out.println("Kitap ID'si: ");
        String bookID = scanner.nextLine();

        // Kitabı kütüphaneye ekle
        library.addBook(new Book(bookID, author, name, price, edition, new java.util.Date())); // Book sınıfını kullanıyoruz
    }

    private static void removeBook(Scanner scanner) {
        System.out.println("Silmek istediğiniz kitabın ID'si: ");
        String bookID = scanner.nextLine();
        library.removeBook(bookID); // Kitabı sil
    }

    private static void updateBookInfo(Scanner scanner) {
        System.out.println("Güncellemek istediğiniz kitabın ID'si: ");
        String bookID = scanner.nextLine();
        System.out.println("Yeni Yazar: ");
        String author = scanner.nextLine();
        System.out.println("Yeni Başlık: ");
        String name = scanner.nextLine();
        System.out.println("Yeni Fiyat: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Satır başını temizle
        System.out.println("Yeni Baskı: ");
        String edition = scanner.nextLine();

        library.updateBook(bookID, author, name, price, edition); // Kitap bilgilerini güncelle
    }

    private static void listBooks() {
        library.listBooks(); // Kitapları listele
    }

    private static void borrowBook(Scanner scanner) {
        System.out.println("Ödünç almak istediğiniz kitabın ID'si: ");
        String bookID = scanner.nextLine();

        if (library.isBookAvailable(bookID)) {
            if (reader.canBorrow()) {
                reader.borrowBook(); // Kitap ödünç alındı
                library.updateBookStatus(bookID, false); // Kitap durumu güncellenir
                System.out.println("Kitap başarıyla ödünç alındı.");
            } else {
                System.out.println("Kitap limitiniz doldu, daha fazla kitap alamazsınız.");
            }
        } else {
            System.out.println("Kitap mevcut değil ya da başka biri tarafından alınmış.");
        }
    }

    private static void returnBook(Scanner scanner) {
        System.out.println("İade etmek istediğiniz kitabın ID'si: ");
        String bookID = scanner.nextLine();

        reader.returnBook(); // Kitap iade edilir
        library.updateBookStatus(bookID, true); // Kitap durumu güncellenir
        System.out.println("Kitap başarıyla iade edildi.");
    }
}