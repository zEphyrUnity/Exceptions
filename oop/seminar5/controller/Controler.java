package oop.seminar5.controller;

import oop.seminar5.data.Teacher;
import oop.seminar5.data.Type;
import oop.seminar5.data.User;
import oop.seminar5.data.Student;
import oop.seminar5.service.DataService;
import oop.seminar5.service.StudyGroupService;
import oop.seminar5.view.StudentView;
import oop.seminar5.view.StudyGroupView;

import java.util.ArrayList;
import java.util.List;


public class Controler {
    private final DataService service = new DataService();
    private final StudyGroupService studyGroupService = new StudyGroupService();
    private final StudentView studentView = new StudentView();
    private final StudyGroupView studyGroupView = new StudyGroupView();

    List<User> studyGroup = new ArrayList<>();

    public void createStudent(String firstName, String secondName, String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName, String lastName, String dateB){
        service.create(firstName, secondName, lastName, dateB, Type.TEACHER);
    }

    public void createStudyGroup() {
        List<Student> studentList = service.getAllStudent();
        Teacher teacher = service.getTeacher();

        studyGroup = studyGroupService.createStudyGroup(teacher, studentList);

        for (User user: studyGroup){
            studyGroupView.printIdOnConsole(user);
        }
    }

    public Teacher getTeacher(){
        return service.getTeacher();
    }

    public void getAllStudent() {
        List<Student> userList = service.getAllStudent();

        for (Student user : userList) {
            studentView.printOnConsole(user);
        }
    }

    public List<User> getStudyGroup(){
        return studyGroupService.getStudyGroup();
    }

    public void viewGroup(List<User> studyGroup){
        studyGroupView.printOnConsole(studyGroup);
    }
}
