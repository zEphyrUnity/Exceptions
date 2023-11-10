package oop.seminar4.data;


import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Group{
    private List<Student> studentList;

    private Teacher teacher;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getUserList() {
        return studentList;
    }

    public void addGroup(Student student){
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new GroupIterator<>(this);
    }
}
