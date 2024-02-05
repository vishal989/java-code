package Multithreading;

public class ThreadBasics {
    public static void main(String[] args) throws InterruptedException {
        Task1 task1 = new Task1();
        task1.setPriority(1);
        task1.start();


        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(10);
        task2Thread.start();

        task1.join();

        Task3 task3 = new Task3();
        task3.start();
    }
}
