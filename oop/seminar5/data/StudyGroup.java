package oop.seminar5.data;

import java.util.List;


public class StudyGroup {
    private List<Student> studentList;
    private Teacher teacher;

    public StudyGroup(List<Student> studentList, Teacher teacher) {
        this.studentList = studentList;
        this.teacher = teacher;
    }

    public Teacher getTeacher(){
        return teacher;
    }

    public List<Student> getStudentList(){
        return studentList;
    }
}
