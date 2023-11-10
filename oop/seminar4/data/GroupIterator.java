package oop.seminar4.data;

import java.util.Iterator;
import java.util.List;


public class GroupIterator<T extends User> implements Iterator<T> {
    private int counter;
    private List<T> userList;

    public GroupIterator(Group group) {
        this.userList = group.getUserList();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < userList.size();
    }

    @Override
    public T next() {
        if(!hasNext())
            return null;
        if (userList.get(counter).getSecondName().equals("2")) {
            counter++;
            return next();
        }
        return userList.get(counter++);
    }

    @Override
    public void remove() {
        userList.remove(counter);
    }
}
