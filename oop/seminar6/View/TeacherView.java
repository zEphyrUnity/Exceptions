package oop.seminar6.View;

import oop.seminar6.Data.Teacher;

public class TeacherView implements View<Teacher> {
    @Override
    public void consoleWrite(Teacher teacher) {
        System.out.println(teacher.toString());
    }
}
