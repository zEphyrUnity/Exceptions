package oop.seminar4.controler;

import oop.seminar4.data.User;


public interface UserControler <T extends User>{
    T create(String firstName, String secondName, String lastName);
}
