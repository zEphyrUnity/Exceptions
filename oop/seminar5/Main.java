
// Создать класс УчебнаяГруппа, содержащий в себе поля Преподаватель и список Студентов;
// Создать класс УчебнаяГруппаСервис, в котором реализована функция (входные параметры - (Teacher, List<Strudent>))
// формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;
// Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и
// преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса;
// Всё вышеуказанное создать согласно принципам ООП, пройдённым на семинаре.


package oop.seminar5;

import oop.seminar5.controller.Controler;


public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();
        controler.createStudent("1", "1","1","1");
        controler.createStudent("2", "2","2","2");
        controler.createStudent("3", "3","3","3");
        controler.createStudent("4", "4","4","4");
        controler.createTeacher("Кирилл", "Моисеев", "Unknown", "5");

//        controler.getAllStudent();
        controler.createStudyGroup();
        controler.viewGroup(controler.getStudyGroup());
    }
}