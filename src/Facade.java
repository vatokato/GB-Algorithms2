import java.text.ChoiceFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Facade {
    static ArrayList<Task> tasks = Task.tasks;
    static ArrayList<Task> tasksFiltered = new ArrayList();
    static SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
    static Date date;

    static ArrayList<Task> getDayTasks(String dateStr) {
        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (Task task : tasks) {
            if(date.equals(task.getDateFinish())) {
                tasksFiltered.add(task);
            }
        }
        return tasksFiltered;
    }
}
