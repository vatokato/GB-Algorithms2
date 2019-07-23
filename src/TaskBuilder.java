public class TaskBuilder {
    protected Task task;

    public Task build() {
        return task;
    }

    public TaskBuilder newTask () {
        task = new Task();
        return this;
    }

    public TaskBuilder title (String title) {
        task.setTitle(title);
        return this;
    }
    public TaskBuilder description (String description) {
        task.setDescription(description);
        return this;
    }
}
