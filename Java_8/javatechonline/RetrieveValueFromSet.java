package practice.java8.javatechonline;

// How to retrieve values from Set using Java 8 ?

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class RetrieveValueFromSet {
    public static void main(String[] args) {
        // Creating a Set
        Set<String> set = new HashSet<>();
        set.add("California");
        set.add("Chicago");
        set.add("New York");

        // Retrieving values of the Set
        Stream<String> stream = set.stream();
        stream.forEach((element) -> { System.out.println(element); });
    }
}
