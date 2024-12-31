package practice.java8.javatechonline;

// Write a Java program using Stream to create a map from a list of strings where the key is the string and the value is its length?

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringLengthMap {
    public static void main(String[] args) {
        // Q. Write a Java program using Stream to create a map from a list of strings
        // where the key is the string and the value is its length?
        List<String> names = Arrays.asList("java", "scala", "javascript", "ruby");
        System.out.println("Original list: " + names);

        // string value map
        Map<String, Integer> map = names.stream().collect(Collectors.toMap(s -> s, String::length));
        System.out.println("Map of string and its length: " + map);

        // Q. How to filter and collect a list of strings that start with a specific letter using Java 8 Stream?
        char letter = 'j';
        List<String> startingWith = names.stream()
                .filter(s -> s.startsWith(String.valueOf(letter)))
                .collect(Collectors.toList());
        System.out.println("List of string starting with letter " + letter + " is " + startingWith);

        // Q. How to sort a list of strings by length using Lambda expressions?
        List<String> naturalOrder = names.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        List<String> reverseOrder = names.stream().sorted((s1, s2) -> s2.length() - s1.length()).collect(Collectors.toList());
        System.out.println("Natural Order: " + naturalOrder + "\nReverse Order: " + reverseOrder);
    }
}
