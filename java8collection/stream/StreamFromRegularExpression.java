package practice.java8collection.stream;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFromRegularExpression {
    public static void main(String[] args) {
        // using split method
        String sentence = "For there is good news yet to hear and fine things to be seen";
        String[] elements = sentence.split(" ");
        Arrays.stream(elements).forEach(System.out::println);

        // Pattern class's method splitAsStream
        String sentence1 = "For there is good news yet to hear and fine things to be seen";
        Pattern pattern = Pattern.compile(" ");
        Stream<String> stream = pattern.splitAsStream(sentence1);
        List<String> words = stream.collect(Collectors.toList());
        System.out.println("words = " + words);

    }
}
// At the first pattern we create an array to store the result of the splitting,
// then create a stream on this array.
// There is no array creation in the second pattern, so less overhead.
// So in both cases, using the splitAsStream() pattern is better.
// It is better memory-wise, and in some cases, CPU-wise.