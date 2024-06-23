package Task_5.View;

import Task_5.Model.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher> {
    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }
}
