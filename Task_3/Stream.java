import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Stream implements Iterator<StudyGroup> {
    private int streamNamber;
    private List<StudyGroup> groupList;

    public int getStreamNamber() {
        return streamNamber;
    }

    public void setStreamNamber(int streamNamber) {
        this.streamNamber = streamNamber;
    }

