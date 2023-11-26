package oop.seminar6.View;

import oop.seminar6.Data.Student;

public class StudentView implements View<Student> {

    @Override
    public void consoleWrite(Student student) {
            System.out.println(student.toString());
    }
}
