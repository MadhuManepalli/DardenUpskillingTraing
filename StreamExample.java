package JavaSrtreams;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Use stream to filter, map, and reduce
        int result = numbers.stream()
                .filter(n -> n % 2 == 1) // Keep only odd numbers
                .map(n -> n * 2) // Double each remaining number
                .reduce(0, Integer::sum); // Sum the values

        // Print the result
        System.out.println("Result: " + result);
    }
}

