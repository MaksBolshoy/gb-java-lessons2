package oop.homework.hw5;

public class Performanse {
    private int id;
    private int studentId;
    private  SchoolSubject subject;
    private Grade grade;

    public Performanse(int id, int studentId, SchoolSubject subject, Grade grade) {
        this.id = id;
        this.studentId = studentId;
        this.subject = subject;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public SchoolSubject getSubject() {
        return subject;
    }

    public void setSubject(SchoolSubject subject) {
        this.subject = subject;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Performanse{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", subject=" + subject +
                ", grade=" + grade +
                '}';
    }
}

