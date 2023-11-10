package oop.seminar4;

import oop.seminar4.controler.StudentGroupControler;
import oop.seminar4.controler.TeacherControler;

import java.util.List;

// Создать класс УчительСервис и реализовать аналогично проделанному на семинаре;
// Создать класс УчительВью и реализовать аналогично проделанному на семинаре;
// Создать класс УчительКонтроллер и реализовать возможность создания,
// редактирования конкретного учителя и отображения списка учителей, имеющихся в системе.


public class Main {
    public static void main(String[] args) {
        TeacherControler teacherControler = new TeacherControler();
        StudentGroupControler controler = new StudentGroupControler();

        teacherControler.create("50", "50", "50");
        teacherControler.create("20", "20", "20");
        teacherControler.create("30", "30", "30");
        teacherControler.create("10", "10", "10");

        controler.create("5", "5", "5");
        controler.create("2", "2", "2");
        controler.create("3", "3", "3");

        controler.print();

        System.out.println("\nCортировка(SrBall)...");
        controler.print(controler.sortedStudentGroupBySrBall());

        System.out.println("\nCортировка(FIO)...");
        controler.print(controler.sortedStudentGroupByFIO());

        System.out.println("\nСписок учителей");
        teacherControler.print();

        System.out.println("\nСортировка учителей(ФИО)...");
        teacherControler.print(teacherControler.sortedStudentGroupFIO());

        teacherControler.editTeacher("50", "50", "50");
        teacherControler.print();
    }
}