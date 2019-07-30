import java.util.Date;

public class Task implements Item {
    private int id;
    public String title;
    public String description;
    public long timestamp;

    public Date dateCreate;
    public Date dateModified;

    protected Task() {
        this.timestamp = new Date().getTime();
    }

    public String toString() {
        return this.title+": "+this.description+": "+this.timestamp;
    }

    public String getTitle() {
        return title;
    }

    public void remove() {
        System.out.format( "Удаление таска %s\n", this.title );
    };

    public static Builder builder () {
        return new Builder();
    }

    static class Builder {
        Task task = new Task();

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
    }
}
