package Multithreading;

public class ThreadBasics {
    public static void main(String[] args){
        Task1 task1 = new Task1();
        task1.start();

        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.start();
    }
}
