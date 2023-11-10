package oop.seminar4.service;

import oop.seminar4.data.Student;
import oop.seminar4.data.StudentGroup;
import oop.seminar4.data.UserComaporator;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class StudentGroupService {
    private StudentGroup studentGroup;

    public void createGroup(List<Student> studentList) {
        studentGroup = new StudentGroup(studentList);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public List<Student> getListStudent() {
        return studentGroup.getUserList();
    }

    public List<Student> getSortedStudentGroupByFIO() {
        List<Student> studentList = new ArrayList<>(studentGroup.getUserList());
        studentList.sort(new UserComaporator());
        return studentList;
    }

    public List<Student> getSortedStudentGroupBySRBall() {
        List<Student> studentList = new ArrayList<>(studentGroup.getUserList());
        Collections.sort(studentList);

        return studentList;
    }

    public Student createStudent(String firstName, String secondName, String lastName) {
        if (studentGroup == null)
            createGroup(new ArrayList<>());

        int maxid = 0;
        for (Student student : studentGroup.getUserList())
            if (student.getStudentId() > maxid)
                maxid = student.getStudentId();

        maxid++;

        Student student = new Student(firstName, secondName, lastName, maxid, 0);
        studentGroup.addGroup(student);

        return student;
    }
}
