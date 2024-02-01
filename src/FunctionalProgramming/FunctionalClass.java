package FunctionalProgramming;

import java.util.*;

public class FunctionalClass {
    public static void main(String[] args){
        List<String> list = List.of("Apple", "beer", "oranges");

//        printBasic(list);
        print(list);
    }


    public static void printBasic(List<String> list){
        for(String s : list){
            System.out.println(s);
        }
    }

    public static void print(List<String> list){
        list.stream().forEach(ele -> System.out.println(ele));
    }

}
