package oop.seminar6.View;

import oop.seminar6.Data.Teacher;

public class TeacherHandsomeView implements View<Teacher>{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_CYAN = "\u001B[36m";


    @Override
    public void consoleWrite(Teacher user) {
        System.out.println(ANSI_RED + user.toString());
        System.out.println(ANSI_CYAN + "********************************************************************" +
                "****************"  + ANSI_RESET);
    }
}
