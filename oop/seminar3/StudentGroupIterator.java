package oop.seminar3;

import java.util.Iterator;
import java.util.List;


public class StudentGroupIterator implements Iterator<Student> {
    private int counter;
    private List<Student> studentList;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.getStudentList();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size();
    }

    @Override
    public Student next() {
        if(!hasNext())
            return null;
        if (studentList.get(counter).getSecondName().equals("2")) {
            counter++;
            return next();
        }
        return studentList.get(counter++);
    }

    @Override
    public void remove() {
        studentList.remove(counter);
    }
}
