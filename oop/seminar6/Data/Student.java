package oop.seminar6.Data;

public class Student extends User {
    private int studentId;

    public Student(String firstName, String secondName, String lastName,
                   String dateB, int studentId) {
        super(firstName, secondName, lastName, dateB);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getLastName() + '\'' +
                ", dateOfBirth=" + super.getDateB() +
                '}';
    }
}
