import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        var today = LocalDate.now().getDayOfMonth();
        System.out.println(today);
        System.out.println(LocalTime.now());
        System.out.println("Hello world!");


        int[] arr = new int[3];
        System.out.println(arr.length); // its a property in case of array but in case of String class its a method



    }
}