
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudyGroup studyGroup1 = new StudyGroup(1, "Группа1");
        StudyGroup studyGroup2 = new StudyGroup(2, "Группа2");
        StudyGroup studyGroup3 = new StudyGroup(3, "Группа3");
        StudyGroup studyGroup4 = new StudyGroup(4, "Группа4");
        
        List<StudyGroup> groupAllList = new ArrayList<>();
        groupAllList.add(studyGroup1);
        groupAllList.add(studyGroup2);
        groupAllList.add(studyGroup3);
        groupAllList.add(studyGroup4);

        List<StudyGroup> groupList = new ArrayList<>();

        Stream stream1 = new Stream(1, groupList);
        stream1.addStudyGroup(studyGroup1);
        stream1.addStudyGroup(studyGroup2);
        
        Stream stream2 = new Stream(2, groupList);

        stream2.addStudyGroup(studyGroup3);
        stream2.addStudyGroup(studyGroup4);
        
        Stream stream3 = new Stream(3, groupList);
        stream3.addStudyGroup(studyGroup4);

        java.util.Iterator<StudyGroup> iterator = groupAllList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        List<Stream> streams = List.of(stream3, stream1, stream2);

        for (Stream stream : streams) {
            System.out.println(stream);
        }
    }
}
