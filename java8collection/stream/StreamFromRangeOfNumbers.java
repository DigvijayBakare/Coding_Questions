package practice.java8collection.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamFromRangeOfNumbers {
    public static void main(String[] args) {
        // iterating the elements of an array
        String[] letters = {"A", "B", "C", "D"};
        List<String> listLetters =
                IntStream.range(0, 10)
                        .mapToObj(index -> letters[index % letters.length])
                        .collect(Collectors.toList());
        System.out.println("listLetters = " + listLetters);

    }
}
