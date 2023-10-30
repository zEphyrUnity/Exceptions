package oop.seminar4.service;

import oop.seminar4.data.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TeacherService {
    private TeacherGroup teacherGroup;

    public void createGroup(List<Teacher> teacherList) {
        teacherGroup = new TeacherGroup(teacherList);
    }

    public TeacherGroup getTeacherGroup() {
        return teacherGroup;
    }

    public List<Teacher> getTeacherList() {
        return teacherGroup.getUserList();
    }

    public List<Teacher> getSortedTeacherByFIO() {
        List<Teacher> teacherList = new ArrayList<>(teacherGroup.getUserList());
        teacherList.sort(new UserComaporator<>());

        return teacherList;
    }

    public Teacher findTeacher(String firstName, String secondName, String lastName) {
        Teacher teacher = new Teacher(firstName, secondName, lastName, -1);
        List<Teacher> teacherList = getTeacherList();

        for (int i = 0; i < teacherList.size(); i++)
            if (teacher.compare(teacher, teacherList.get(i)) == 0)
                return teacherList.get(i);

        return null;
    }

    public void editTeacher(String firstName, String secondName, String lastName) {
        Scanner scanner = new Scanner(System.in);
        Teacher teacher = findTeacher(firstName, secondName, lastName);

        if (teacher != null) {
            System.out.print("Введите Имя: ");
            teacher.setFirstName(scanner.nextLine());

            System.out.print("Введите Фамилию: ");
            teacher.setSecondName(scanner.nextLine());

            System.out.print("Введите Отчество: ");
            teacher.setLastName(scanner.nextLine());

            System.out.println("Данные обновлены..");
        } else {
            System.out.println("Учитель не найден..");
        }
    }

    public Teacher createTeacher(String firstName, String secondName, String lastName) {
        if (teacherGroup == null)
            createGroup(new ArrayList<>());

        int maxid = 0;
        for (Teacher teacher : teacherGroup.getUserList())
            if (teacher.getTeacherId() > maxid)
                maxid = teacher.getTeacherId();

        maxid++;

        Teacher teacher = new Teacher(firstName, secondName, lastName, maxid);
        teacherGroup.addTeacher(teacher);

        return teacher;
    }
}
