package FunctionalProgramming;

import java.util.*;

public class FunctionalClass {
    public static void main(String[] args){
        List<String> list = List.of("Apple", "beer", "oranges", "bat", "cat");

//        printBasic(list);
//        print(list);
        printWithFilter(list);

        List<Integer> intList = List.of(9,3,4,62,22, 3, 4, 9, 99, 2);
        intList.stream().forEach(ele -> System.out.println(ele));

        int sum = intList.stream().reduce(0, (n1, n2) -> n1 + n2);
        System.out.println(sum);

        intList.stream().distinct().sorted().map(e -> e * e).forEach(e -> System.out.println(e));
    }


    public static void printBasic(List<String> list){
        for(String s : list){
            System.out.println(s);
        }
    }

    public static void print(List<String> list){
        list.stream().forEach(ele -> System.out.println(ele));
    }

    public static void printWithFilter(List<String> list){
        list.stream().filter(ele -> ele.endsWith("at")).forEach(ele -> System.out.println(ele));
    }

}
