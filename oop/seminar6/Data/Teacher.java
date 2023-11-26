package oop.seminar6.Data;

public class Teacher extends User {
    private int teacherId;

    public Teacher(String firstName, String secondName, String lastName, String dateB, int teacherId) {
        super(firstName, secondName, lastName, dateB);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getLastName() + '\'' +
                ", dateOfBirth=" + super.getDateB() +
                '}';
    }
}
