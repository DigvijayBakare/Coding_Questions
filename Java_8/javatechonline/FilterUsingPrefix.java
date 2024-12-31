package practice.java8.javatechonline;

// How to filter an array of strings by a given prefix using Java 8 Stream?

import java.util.Arrays;

public class FilterUsingPrefix {
    public static void main(String[] args) {
        String[] strings = {"java", "scala", "javascript", "ruby","spring","angular"};
        String prefix = "j";
        String[] filtered = Arrays.stream(strings)
                .filter(s -> s.startsWith(prefix))
                .toArray(String[]::new);
        System.out.println("Filtered strings: " + Arrays.toString(filtered));
    }
}
