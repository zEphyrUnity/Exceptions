package oop.lection5.task3.Core.Infrastructure;

import java.util.Random;

public class Generator {
    static Random r = new Random();

    public static int number() {
        return r.nextInt(100);
    }
}
