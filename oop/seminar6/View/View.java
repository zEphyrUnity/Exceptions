package oop.seminar6.View;

import oop.seminar6.Data.User;


public interface View<T extends User> {
    void consoleWrite(T user);
}


