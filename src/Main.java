import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DataBase db = new DataBase();
        db.connect();
        ArrayList entities = db.getEntities("taskManager.projects");
        System.out.println(entities.size());




        // ------------------- builder - TaskManager ----------------------------
        Project p1 = new ProjectBuilder()
                .newProject()
                .title("проект 1")
                .description("описание первого проекта")
                .build();

        Project p2 = new ProjectBuilder()
                .newProject()
                .title("проект 2")
                .description("")
                .parent(0)
                .build();

        //Project p3 = new Project(); //ошибка, т.к. project protected

        // System.out.println(p1);
        // System.out.println(p2);

        // сделать компоновщик: интерфейс "послать сообщение". обычный юзер может послать 1 сообщение, админ может послать массовое сообщение

        // дз5: наблюдатель, который удаляет таски при удалении проекта, подписка происходит при указании родителя "parent"
        Task task1 = new TaskBuilder()
                .newTask()
                .title("task 1")
                .parent(p1)
                .build();
        Task task2 = new TaskBuilder()
                .newTask()
                .title("task 2")
                .parent(p1)
                .build();
        Task task3 = new TaskBuilder()
                .newTask()
                .title("task 3")
                .parent(p1)
                .build();
        Task task4 = new TaskBuilder()
                .newTask()
                .title("task 3")
                .build();

        p1.remove();



    }
}
