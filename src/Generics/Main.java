package Generics;

public class Main {
    public static void main(String[] args){
        CustomClass<Integer> list1 = new CustomClass<>();

        list1.addEle(Integer.valueOf(1));
        list1.addEle(Integer.valueOf(2));

        System.out.println(list1.toString());
    }
}
