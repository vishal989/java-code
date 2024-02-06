package Exceptions;

public class Main {
    public static void main(String[] args){
        Amount amt1 = new Amount("USD", 10);
        Amount amt2 = new Amount("USD", 20);

        amt1.add(amt2);
        System.out.println(amt1);

        Amount amt3 = new Amount("RS", 20);
        amt1.add(amt3);
        System.out.println(amt1);
    }
}
