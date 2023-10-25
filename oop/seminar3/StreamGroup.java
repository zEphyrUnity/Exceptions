package oop.seminar3;

import java.util.Iterator;
import java.util.List;

public class StreamGroup implements Iterable<StudentGroup>{
    private List<StudentGroup> streamList;

    public StreamGroup(List<StudentGroup> streamList) {
        this.streamList = streamList;
    }

    public List<StudentGroup> getGroupList() {
        return streamList;
    }

    public void addStream(StudentGroup studentGroup){
        streamList.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamGroupIterator(this);
    }

    @Override
    public String toString() {
        return "StreamGroup{ " + streamList.hashCode() +
                " streamList= " + streamList +
                '}';
    }
}
