package practice.java8collection.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFromBuilder {
    public static void main(String[] args) {
        Stream.Builder<String> builder = Stream.<String>builder();

        builder.add("one")
                .add("two")
                .add("three")
                .add("four");

        Stream<String> stream = builder.build();

        List<String> list = stream.collect(Collectors.toList());
        System.out.println("list = " + list);

    }
}
