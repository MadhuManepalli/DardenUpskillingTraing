package JavaSrtreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapFlatMapExample {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("java", "streams", "example");

		// Mapping words to their lengths
		List<Integer> wordLengths = words.stream().map(String::length).collect(Collectors.toList());

		System.out.println(wordLengths);

		// FlatMap example with split() method
		List<String> letters = words.stream().flatMap(word -> Arrays.stream(word.split("")))
				.collect(Collectors.toList());

		System.out.println("Result = " + letters);
	}
}
