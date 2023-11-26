package oop.seminar6.Controler;

import oop.seminar6.Data.Teacher;
import oop.seminar6.Data.Type;
import oop.seminar6.Service.DataService;
import oop.seminar6.View.View;

// В этом классе используется dependency injection principle - паттерн внедрение зависимости через конструктор

public class TeacherControler {
    private final DataService service;
    private final View<Teacher> teacherView;  // Инверсия зависимости Барбары Лисков

    // В этом конструкторе внедряется вьювер и датасервис
    public TeacherControler(DataService service, View<Teacher> teacherView) {
        if (service == null)
            throw new NullPointerException();

        if (teacherView == null)
            throw new NullPointerException();

        this.service = service;
        this.teacherView = teacherView;
    }

    public void createTeacher(String firstName, String secondName, String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.TEACHER);
    }

    public Teacher getTeacher() {
        return service.getTeacher();
    }

    public void showTeacher() {
        Teacher teacher = service.getTeacher();

        teacherView.consoleWrite(teacher); // Здесь используется вьюер зависимость
    }
}
