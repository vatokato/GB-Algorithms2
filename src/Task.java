import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Task implements Item {
    private String id;
    public String title;
    public String description;
    public long timestamp;

    public Date dateFinish;

    public Date dateCreate;
    public Date dateModified;

    static ArrayList tasks = new ArrayList();

    protected Task() {
        this.timestamp = new Date().getTime();
        this.id = UUID.randomUUID().toString();
        tasks.add(this);
    }

    public String toString() {
        return this.title+": "+this.description+": "+this.timestamp+". Deadline:"+this.dateFinish+" /id:"+this.id;
    }

    public String getTitle() {
        return title;
    }

    public Date getDateFinish() {
        return this.dateFinish;
    }

    public void remove() {
        System.out.format( "Удаление таска %s\n", this.title );
    };

    public static Builder builder () {
        return new Builder();
    }

    static class Builder {
        Task task = new Task();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        Task build() {
            return task;
        }

        Builder title (String title) {
            task.title = title;
            return this;
        }
        Builder description (String description) {
            task.description=description;
            return this;
        }
        Builder deadline (String date){
            try {
                task.dateFinish=format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return this;
        }
    }
}
