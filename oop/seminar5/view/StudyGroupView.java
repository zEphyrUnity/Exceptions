package oop.seminar5.view;

import oop.seminar5.data.Student;
import oop.seminar5.data.Teacher;
import oop.seminar5.data.User;

import java.util.List;

public class StudyGroupView {
    public void printIdOnConsole(User user){
        if(user instanceof Teacher)
            System.out.println("ID учителя:  " + ((Teacher) user).getTeacherId());

        if(user instanceof Student)
            System.out.println("ID студента: " + ((Student) user).getStudentId());
    }

    public void printOnConsole(List<User> studyGroup){
        for(User user: studyGroup)
            System.out.println(user);
    }
}
