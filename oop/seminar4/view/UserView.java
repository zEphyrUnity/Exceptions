package oop.seminar4.view;

import oop.seminar4.data.User;

import java.util.List;


public interface UserView<T extends User> {
    void sendOnconsole(List<T> list);
}
