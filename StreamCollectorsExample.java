package JavaSrtreams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectorsExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Collecting fruits with length 5 or less into a new list
        List<String> shortFruits = fruits.stream()
            .filter(s -> s.length() <= 5)
            .collect(Collectors.toList());

        System.out.println(shortFruits);
    }
}
