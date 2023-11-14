package oop.lection5.task1;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public int getValue(String title){
        System.out.printf("%s", title);
        return in.nextInt();
    }

    public void print(String title, int data) {
        System.out.printf("%s %d\n", title, data);
    }
}
