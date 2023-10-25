package oop.seminar3;

import java.util.ArrayList;
import java.util.List;


// Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
// Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
// Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
// Модифицировать класс Контроллер, добавив в него созданный сервис;
// Модифицировать класс Контроллер, добавив в него метод, сортирующий список потоков, путём вызова созданного сервиса.


public class Main {
    public static void main(String[] args) {
        StudentGroupControler controler = new StudentGroupControler();

        Student student1 = controler.createStudent("5", "5", "5", 1, 5);
        Student student2 = controler.createStudent("2", "2", "2", 2, 3);
        Student student3 = controler.createStudent("3", "3", "3", 3, 4);
        System.out.println(student1.compareTo(student2));

        List<Student> studentList = List.of(new Student[]{student1, student2, student3});
        controler.createStudentGroup(studentList);
        controler.print();

        System.out.println("Cортировка(SrBall)...");
        controler.print(controler.sortedStudentGroupBySrBall());

        System.out.println("Cортировка(F I O)...");
        controler.print(controler.sortedStudentGroupByFIO());

        List<StudentGroup> stream1 = new ArrayList<>();
        stream1.add(controler.studentGroupService.getStudentGroup());

        List<StudentGroup> stream2 = new ArrayList<>();
        stream2.add(controler.studentGroupService.getStudentGroup());
        stream2.add(controler.studentGroupService.getStudentGroup());

        List<StudentGroup> stream3 = new ArrayList<>();
        stream3.add(controler.studentGroupService.getStudentGroup());
        stream3.add(controler.studentGroupService.getStudentGroup());
        stream3.add(controler.studentGroupService.getStudentGroup());
        stream3.add(controler.studentGroupService.getStudentGroup());

        controler.createStreamGroup(stream3);
        controler.createStreamGroup(stream2);
        controler.createStreamGroup(stream1);
        controler.createStreamGroup(stream2);

        System.out.println("---------------");
        for(var item : controler.streamGroupService.getStreamGroupList()){
            System.out.println("Количество групп в потоке: " + item.getGroupList().size());
        }

        ArrayList<StreamGroup> sortedStreamGroups =
                controler.sortedStreamByGroupQuantity(controler.streamGroupService.getStreamGroupList());

        System.out.println("---------------");
        for(var item : sortedStreamGroups){
            System.out.println("Количество групп в потоке: " + item.getGroupList().size());
        }
    }
}