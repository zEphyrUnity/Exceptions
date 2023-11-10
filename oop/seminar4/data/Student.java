package oop.seminar4.data;


public class Student extends User implements Comparable<Student> {

    private int studentId;
    private int srBall;

    public Student(String firstName, String secondName, String lastName, int studentId, int srBall) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
        this.srBall = srBall;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getSrBall() {
        return srBall;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", studentId=" + studentId +
                ", srBall=" + srBall +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.srBall == o.getSrBall())
            return 0;
        if(this.srBall > o.srBall)
            return 1;
        return -1;
    }
}
