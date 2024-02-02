package Multithreading;

public class Task1 extends Thread{
    public void run(){
        for(int i = 1; i <= 100; ++i){
            System.out.print(i + " ");
        }
    }
}
