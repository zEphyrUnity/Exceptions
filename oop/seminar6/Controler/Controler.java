package oop.seminar6.Controler;

import oop.seminar6.Data.Type;
import oop.seminar6.Data.User;
import oop.seminar6.Data.Student;
import oop.seminar6.Service.DataService;
import oop.seminar6.View.StudentView;

import java.util.List;

public class Controler {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user: userList){
            studentView.printOnConsole((Student) user);
        }
    }
}
