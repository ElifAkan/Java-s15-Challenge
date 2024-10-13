package library.record;

import java.util.Date;

public class Student extends MemberRecord {
    private String studentId; // Öğrenci ID'si
    private String course; // Öğrenci kursu

    public Student(String memberId, String name, String address, String phoneNo, Date dateOfMembership, String studentId, String course) {
        super(memberId, name, address, phoneNo, dateOfMembership, 5); // Öğrencilerin max kitap limiti 5
        this.studentId = studentId;
        this.course = course;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCourse() {
        return course;
    }
}
