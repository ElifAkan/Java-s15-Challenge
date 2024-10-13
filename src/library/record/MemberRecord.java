package library.record;

import java.util.Date;

public class MemberRecord {
    private String memberId; // Üye ID'si
    private String name; // Üye ismi
    private String address; // Üye adresi
    private String phoneNo; // Üye telefon numarası
    private Date dateOfMembership; // Üyelik tarihi
    private int noBooksIssued; // Ödünç alınan kitap sayısı
    private final int maxBookLimit; // Maksimum ödünç kitap limiti

    // Constructor
    public MemberRecord(String memberId, String name, String address, String phoneNo, Date dateOfMembership,int maxBookLimit) {
        this.memberId = memberId; // Üye ID'sini atar
        this.name = name; // Üye ismini atar
        this.address = address; // Üye adresini atar
        this.phoneNo = phoneNo; // Üye telefon numarasını atar
        this.dateOfMembership = dateOfMembership; // Üyelik tarihini atar
        this.noBooksIssued = 0; // Başlangıçta 0 kitap
        this.maxBookLimit = 5; // Maksimum kitap limiti 5
    }

    // Üye bilgilerini döndürür
    public String getMemberId() {
        return memberId; // Üye ID'sini döndürür
    }

    public String getName() {
        return name; // Üye ismini döndürür
    }

    public String getAddress() {
        return address; // Üye adresini döndürür
    }

    public String getPhoneNo() {
        return phoneNo; // Üye telefon numarasını döndürür
    }

    public Date getDateOfMembership() {
        return dateOfMembership; // Üyelik tarihini döndürür
    }

    public int getNoBooksIssued() {
        return noBooksIssued; // Ödünç alınan kitap sayısını döndürür
    }

    // Ödünç alınan kitap sayısını artırır
    public boolean incBookIssued() {
        if (noBooksIssued < maxBookLimit) {
            noBooksIssued++; // Kitap sayısını artır
            return true; // Başarılı bir şekilde kitap ödünç alındı
        } else {
            System.out.println("Maksimum kitap limiti aşıldı. Ödünç alamazsınız.");
            return false; // Kitap limiti aşıldı
        }
    }

    // Ödünç alınan kitap sayısını azaltır
    public boolean decBookIssued() {
        if (noBooksIssued > 0) {
            noBooksIssued--; // Kitap sayısını azalt
            return true; // Başarılı bir şekilde kitap iade edildi
        } else {
            System.out.println("Ödünç alınan kitap yok.");
            return false; // İade edilecek kitap yok
        }
    }

    // Fatura ödeme işlemi
    public void payBill(double amount) {
        System.out.println(name + " için " + amount + " TL fatura ödendi."); // Fatura ödeme işlemini gösterir
    }
}