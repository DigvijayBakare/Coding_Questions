package practice.java8collection.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamFromIterator {
    public static void main(String[] args) {
        // Create a List of strings
        List<String> items = Arrays.asList("apple", "banana", "cherry");

        // Get an Iterator from the List
        Iterator<String> iterator = items.iterator();

        // Estimate size and characteristics for the Spliterator
        long estimateSize = items.size();
        int characteristics = Spliterator.ORDERED;

        // Create a Spliterator from the Iterator
        Spliterator<String> spliterator = Spliterators.spliterator(iterator, estimateSize, characteristics);

        // Create a Stream from the Spliterator
        boolean parallel = false; // Change to true for parallel processing
        Stream<String> stream = StreamSupport.stream(spliterator, parallel);

        // Print the elements of the stream
        stream.forEach(System.out::println);
    }
}
