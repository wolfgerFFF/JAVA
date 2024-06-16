import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override

    public int compare(Stream o1, Stream o2) {
        if (o1.getGroupList().size() > o2.getGroupList().size())
            return 1;
        if (o1.getGroupList().size() < o2.getGroupList().size())
            return -1;
        return 0;

    }
}
