package oop.seminar4.data;

import java.util.Comparator;


public class Teacher extends User implements Comparator<Teacher> {
    private int teacherId;

    public Teacher(String firstName, String secondName, String lastName, int teacherId) {
        super(firstName, secondName, lastName);
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
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", teacherId=" + teacherId +
                '}';
    }

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return new UserComaporator<Teacher>().compare(o1, o2);
    }
}
