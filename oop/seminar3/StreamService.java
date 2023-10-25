package oop.seminar3;

import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private StreamGroup streamGroup;
    private ArrayList<StreamGroup> streamGroupList = new ArrayList<>();

    public void createStream(List<StudentGroup> streamList) {
        streamGroup = new StreamGroup(streamList);
        streamGroupList.add(streamGroup);
    }

    public StreamGroup getStreamGroup() {
        return streamGroup;
    }

    public ArrayList<StreamGroup> getStreamGroupList() { return streamGroupList; }

    public ArrayList<StreamGroup> getSortedStream(ArrayList<StreamGroup> streamGroup) {
        ArrayList<StreamGroup> streamList = streamGroup;
        streamList.sort(new StreamComparator());
        return streamList;
    }
}
