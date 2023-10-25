package oop.seminar3;

import java.util.Iterator;
import java.util.List;

public class StreamGroupIterator implements Iterator<StudentGroup> {
    private int counter;
    private List<StudentGroup> streamList;


    public StreamGroupIterator(StreamGroup stream){
        this.streamList = stream.getGroupList();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < streamList.size();
    }

    @Override
    public StudentGroup next() {
        if(!hasNext())
            return null;

        return streamList.get(counter++);
    }

    public void remove() {
        streamList.remove(counter);
    }
}