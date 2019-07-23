public class Main {
    public static void main(String[] args) {
        // ------------------- builder - TaskManager ----------------------------
        Item t1 = new TaskBuilder()
            .newTask()
            .title("задача 1")
            .description("описание первой задачи")
            .build();

        Item t2 = new TaskBuilder()
            .newTask()
            .title("задача 2")
            .build();

         System.out.println(t1);
         System.out.println(t2);
    }
}
