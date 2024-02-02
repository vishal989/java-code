import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        var today = LocalDate.now().getDayOfMonth();
        System.out.println(today);
        System.out.println(LocalTime.now());
        System.out.println("Hello world!");


        int[] arr = new int[3];
        System.out.println(arr.length); // its a property in case of array but in case of String class its a method


        List<String> list = List.of("Apple", "Beer", "Oranges", "bat", "cat");
        list.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));
        list.stream().forEach(e -> System.out.println(e.length()));

        IntStream.range(1, 11).forEach(e -> System.out.println(e));

        System.out.println(List.of(2, 3, 5, 8, 2).stream().max((n1, n2) -> Integer.compare(n1, n2)).get());
    }
}