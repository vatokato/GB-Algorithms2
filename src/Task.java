import java.util.Date;

public class Task implements Item {
    private int id;
    private String title;
    private String description;

    private Date dateCreate;
    private Date dateModified;

    protected Task() {}

    public String toString() {
        return this.title+": "+this.description;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void remove() {
        System.out.format( "Удаление таска %s\n", this.title );
    };
}
