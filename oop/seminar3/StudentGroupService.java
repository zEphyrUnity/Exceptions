package oop.seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StudentGroupService {
    private StudentGroup studentGroup;

    public void createGroup(List<Student> studentList){
        studentGroup = new StudentGroup(studentList);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public Student createStudent(String firstName, String secondName, String lastName, int studentId, int srBall){
        return new Student(firstName, secondName, lastName, studentId, srBall);
    }

    public List<Student> getSortedStudentGroupBySRBall(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;

    }

    public List<Student> getListStudent(){
        return studentGroup.getStudentList();
    }

    public List<Student> getSortedStudentGroupByFIO(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new StudentComaporator());
        return studentList;
    }
}
