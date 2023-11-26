package oop.seminar6;

import oop.seminar6.Controler.StudentControler;
import oop.seminar6.Controler.TeacherControler;
import oop.seminar6.Data.Student;
import oop.seminar6.Data.Teacher;
import oop.seminar6.Service.DataService;
import oop.seminar6.View.StudentHandsomeView;
import oop.seminar6.View.TeacherHandsomeView;
import oop.seminar6.View.View;


public class Main {
    public static void main(String[] args) {
        DataService dataService = new DataService();
        View<Teacher> teacherHandsomeView = new TeacherHandsomeView();
        View<Student> studentHandsomeView = new StudentHandsomeView();

        // Использован принцип единственной ответственности, вместо добавления функционала
        // классу Controller для работы с Teacher, Controler был разделён на два класса -
        // - TeacherControler и StudentControler

        // Внедряем зависимость вьювер, и датасервис
        TeacherControler teacherControler = new TeacherControler(dataService, teacherHandsomeView);
        StudentControler studentControler = new StudentControler(dataService, studentHandsomeView);

        studentControler.createStudent("1", "1","1","1");
        studentControler.createStudent("2", "2","2","2");
        studentControler.createStudent("3", "3","3","3");
        studentControler.createStudent("4", "4","4","4");

        teacherControler.createTeacher("400", "400","400","400");

        studentControler.showStudents();
        teacherControler.showTeacher();
    }
}