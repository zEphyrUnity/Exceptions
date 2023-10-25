package oop.seminar3;

import java.util.ArrayList;
import java.util.List;


public class StudentGroupControler {
    StudentGroupService studentGroupService = new StudentGroupService();
    StudentGroupView studentGroupView = new StudentGroupView();

    StreamService streamGroupService = new StreamService();

    public void createStreamGroup(List<StudentGroup> groupList) {streamGroupService.createStream(groupList);}

    public ArrayList<StreamGroup> sortedStreamByGroupQuantity(ArrayList<StreamGroup> streamGroup){
        return streamGroupService.getSortedStream(streamGroup);
    }

    public void createStudentGroup(List<Student> studentList){
        studentGroupService.createGroup(studentList);
    }
    public Student createStudent(String firstName, String secondName, String lastName, int studentId, int srBall){
        return studentGroupService.createStudent(firstName, secondName, lastName, studentId, srBall);
    }

    public List<Student> sortedStudentGroupBySrBall(){
        return studentGroupService.getSortedStudentGroupBySRBall();
    }

    public List<Student> sortedStudentGroupByFIO(){
        return studentGroupService.getSortedStudentGroupByFIO();
    }
    public void print(){
        studentGroupView.printStudentGroup(studentGroupService.getListStudent());
    }

    public void print(List<Student> list){
        studentGroupView.printStudentGroup(list);
    }
}
