package oop.seminar6.View;

import oop.seminar6.Data.Student;

public class StudentHandsomeView implements View<Student>{
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    @Override
    public void consoleWrite(Student user) {
        System.out.println(ANSI_GREEN + user.toString());
        System.out.println(ANSI_PURPLE + "********************************************************************" +
                "****************"  + ANSI_RESET);
    }
}
