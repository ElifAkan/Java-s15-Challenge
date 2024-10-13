package library.record;

import java.util.Date; // Date sınıfını içe aktar

public class Faculty extends MemberRecord {
    private String facultyId; // Fakülte ID'si
    private String department; // Fakülte bölümü

    public Faculty(String memberId, String name, String address, String phoneNo, Date dateOfMembership, String facultyId, String department) {
        super(memberId, name, address, phoneNo, dateOfMembership, 10); // Fakülte üyelerinin max kitap limiti 10
        this.facultyId = facultyId;
        this.department = department;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public String getDepartment() {
        return department;
    }
}
