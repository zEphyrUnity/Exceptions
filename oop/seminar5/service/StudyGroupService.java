package oop.seminar5.service;

import oop.seminar5.data.Student;
import oop.seminar5.data.Teacher;
import oop.seminar5.data.User;

import java.util.ArrayList;
import java.util.List;


public class StudyGroupService {
    List<User> studyGroup = new ArrayList<>();

    public List<User> createStudyGroup(Teacher teacher, List<Student> studentList){
        studyGroup.add(teacher);
        studyGroup.addAll(studentList);

        return studyGroup;
    }

    public List<User> getStudyGroup(){
        return studyGroup;
    }
}
