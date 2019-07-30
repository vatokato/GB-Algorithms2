public class Main {
    public static void main(String[] args) throws InterruptedException {
        // ------------------- builder - TaskManager ----------------------------
        Task.builder()
            .title("задача 1")
            .description("описание первой задачи")
            .build();

        Thread.sleep(500);

        Task.builder()
            .title("задача 2")
            .deadline("31.07.2019")
            .build();

        Task.builder()
            .title("задача 3")
            .deadline("31.07.2019")
            .build();

        Task.builder()
            .title("задача 4")
            .deadline("6.08.2019")
            .build();

         System.out.println(Facade.getDayTasks("31.07.2019"));
         System.out.println(Facade.getDayTasks("6.08.2019"));
         System.out.println(Facade.getDayTasks());
    }
}
