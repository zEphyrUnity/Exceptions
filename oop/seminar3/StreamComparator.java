package oop.seminar3;

import java.util.Comparator;

public class StreamComparator implements Comparator<StreamGroup>{
    @Override
    public int compare(StreamGroup stream1, StreamGroup stream2) {
        return Integer.compare(stream1.getGroupList().size(), stream2.getGroupList().size());
    }
}
