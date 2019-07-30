public class Main {
    public static void main(String[] args) throws InterruptedException {
        // ------------------- builder - TaskManager ----------------------------
        Item t1 = Task.builder()
            .title("задача 1")
            .description("описание первой задачи")
            .build();

        Thread.sleep(500);

        Item t2 = Task.builder()
            .title("задача 2")
            .build();

         System.out.println(t1);
         System.out.println(t2);
    }
}
