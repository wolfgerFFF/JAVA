package Task_5.View;

import Task_5.Model.User;

import java.util.List;

public interface UserView<T extends User> {
	public void sendOnConsole(List<T> list);
}
