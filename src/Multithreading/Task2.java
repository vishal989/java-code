package Multithreading;

public class Task2 implements Runnable{
    public void run(){
        for(int i = 101; i <= 200; ++i){
            System.out.print(i + " ");
        }
    }
}
