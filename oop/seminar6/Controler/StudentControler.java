package oop.seminar6.Controler;

import oop.seminar6.Data.Type;
import oop.seminar6.Data.Student;
import oop.seminar6.Service.DataService;
import oop.seminar6.View.View;

import java.util.List;

// В этом классе используется dependency injection principle - паттерн внедрение зависимости через конструктор

public class StudentControler {
    private final DataService service;
    private final View<Student> studentView;     // Инверсия зависимости Барбары Лисков

    // В этом конструкторе внедряется вьювер и датасервис
    public StudentControler(DataService service, View<Student> studentView) {
        if (service == null)
            throw new NullPointerException();

        if (studentView == null)
            throw new NullPointerException();

        this.service = service;
        this.studentView = studentView;
    }

    public void createStudent(String firstName, String secondName, String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.STUDENT);
    }

    public List<Student> getAllStudent() {
        return service.getAllStudent();
    }

    public void showStudents() {
        List<Student> studentList = service.getAllStudent();

        for (Student user : studentList)
            studentView.consoleWrite(user); // Здесь используется вьюер зависимость
    }
}
