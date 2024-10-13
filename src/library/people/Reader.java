package library.people;

public class Reader extends Person {
    private int borrowedBooksCount; // Ödünç alınan kitap sayısı
    private final int maxBookLimit = 5; // Maksimum kitap limiti 5

    public Reader(String name, String id) {
        super(name, id);
        this.borrowedBooksCount = 0; // Başlangıçta ödünç alınan kitap yok
    }

    @Override
    public void displayInfo() {

    }

    // Kullanıcı kitap ödünç alabilir mi?
    public boolean canBorrow() {
        return borrowedBooksCount < maxBookLimit;
    }

    // Kitap ödünç alır
    public void borrowBook() {
        if (canBorrow()) {
            borrowedBooksCount++; // Kitap sayısını artır
            System.out.println("Kitap başarıyla ödünç alındı.");
        } else {
            System.out.println("Kitap limiti aşıldı. Daha fazla kitap ödünç alamazsınız.");
        }
    }

    // Kitap iade eder
    public void returnBook() {
        if (borrowedBooksCount > 0) {
            borrowedBooksCount--; // Kitap sayısını azalt
            System.out.println("Kitap başarıyla iade edildi.");
        } else {
            System.out.println("İade edilecek kitap yok.");
        }
    }

    // Kaç kitap ödünç alındığını döndürür
    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }
}
