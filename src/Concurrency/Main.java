package Concurrency;

public class Main {
    public static void main(String[] args){
        BiCounter bi = new BiCounter();
        bi.incremenetI();
        bi.incremenetI();
        bi.incremenetI();
        System.out.println(bi.getI());
    }

}
