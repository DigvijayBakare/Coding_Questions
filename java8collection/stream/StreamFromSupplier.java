package practice.java8collection.stream;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFromSupplier {
    public static void main(String[] args) {
        // This will program will get stuck forever
        /*Stream<String> generated = Stream.generate(() -> "+");
        List<String> strings = generated.collect(Collectors.toList());
        System.out.println(strings);*/

        // Using limit() to fix the above problem
        Stream<String> generated = Stream.generate(() -> "+");
        List<String> strings = generated.limit(10L)
                        .collect(Collectors.toList());

        System.out.println("strings = " + strings);


        // Create a Supplier that generates random integers
        Supplier<Integer> randomIntegerSupplier = () -> (int) (Math.random() * 100); // Random integers between 0 and 99

        // Generate a stream of random integers
        Stream<Integer> randomIntegerStream = Stream.generate(randomIntegerSupplier);

        // Limit the stream to 10 elements and print them
        randomIntegerStream.limit(10).forEach(System.out::println);
    }
}
