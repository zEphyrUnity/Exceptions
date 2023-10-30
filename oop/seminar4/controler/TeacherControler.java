package oop.seminar4.controler;

import oop.seminar4.data.Teacher;
import oop.seminar4.service.TeacherService;
import oop.seminar4.view.TeacherGroupView;

import java.util.List;


public class TeacherControler implements UserControler<Teacher> {
    TeacherService teacherGroupService = new TeacherService();
    TeacherGroupView teacherGroupView = new TeacherGroupView();

    @Override
    public Teacher create(String firstName, String secondName, String lastName) {
        return teacherGroupService.createTeacher(firstName, secondName, lastName);
    }

    public List<Teacher> getTeacherList() {
        return teacherGroupService.getTeacherList();
    }

    public void createTeacherGroup(List<Teacher> teacherList) {
        teacherGroupService.createGroup(teacherList);
    }

    public List<Teacher> sortedStudentGroupFIO() {
        return teacherGroupService.getSortedTeacherByFIO();
    }

    public void print() {
        teacherGroupView.printTeacherGroup(teacherGroupService.getTeacherList());
    }

    public void print(List<Teacher> list) {
        teacherGroupView.printTeacherGroup(list);
    }

    public Teacher findTeacher(String firstName, String secondName, String lastname) {
        return teacherGroupService.findTeacher(firstName, secondName, lastname);
    }

    public void editTeacher(String firstName, String secondName, String lastname){
        teacherGroupService.editTeacher(firstName, secondName, lastname);
    }
}
