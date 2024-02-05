package Multithreading;

public class Task3 extends Thread{
    public void run(){
        for(int i = 201; i <= 300; ++i){
            System.out.print(i + " ");
        }
    }
}
