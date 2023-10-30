package oop.seminar4.data;

import java.util.Iterator;
import java.util.List;


public class TeacherGroup implements Group, Iterable<Teacher>{
    private List<Teacher> teacherList;

    public TeacherGroup(List<Teacher> teacherList){
        this.teacherList = teacherList;
    }

    public List<Teacher> getUserList(){
        return teacherList;
    }

    public void addTeacher(Teacher teacher){
        teacherList.add(teacher);
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new GroupIterator<>(this);
    }
}