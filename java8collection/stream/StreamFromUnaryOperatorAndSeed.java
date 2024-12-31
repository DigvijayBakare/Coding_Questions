package practice.java8collection.stream;

import java.util.stream.Stream;

public class StreamFromUnaryOperatorAndSeed {
    public static void main(String[] args) {
        // triangle pattern using stream api
//        Stream<String> iterated = Stream.iterate("+ ", s -> s + "+ ");
//        iterated.limit(5L).forEach(System.out::println);

        // another way from java se 9
        Stream<String> iterated = Stream.iterate("+", s -> s.length() <= 5, s -> s + "+");
        iterated.forEach(System.out::println);

    }
}
