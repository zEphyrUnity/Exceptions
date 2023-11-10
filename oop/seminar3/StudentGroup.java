package oop.seminar3;

import java.util.Iterator;
import java.util.List;


public class StudentGroup implements Iterable<Student>{
    private List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addGroup(Student student){
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                " studentList= " + studentList +
                '}';
    }
}
