import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream strm1, Stream strm2) {
        if (strm1.getGroupList().size() > strm2.getGroupList().size())
            return 1;
        if (strm1.getGroupList().size() < strm2.getGroupList().size())
            return -1;
        return 0;
    }
}
