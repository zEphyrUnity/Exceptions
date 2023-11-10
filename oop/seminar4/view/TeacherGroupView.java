package oop.seminar4.view;

import oop.seminar4.data.Teacher;

import java.util.List;


public class TeacherGroupView {
    public void printTeacherGroup(List<Teacher> teacherGroups) {
        for (Teacher tg : teacherGroups)
            System.out.println(tg);
    }
}
