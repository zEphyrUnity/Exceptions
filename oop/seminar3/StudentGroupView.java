package oop.seminar3;

import java.util.List;


public class StudentGroupView {
    public void printStudentGroup(List<Student> studentGroup){
        for (Student st: studentGroup) {
            System.out.println(st);
        }
    }
}
