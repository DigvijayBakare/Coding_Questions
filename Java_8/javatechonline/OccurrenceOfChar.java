package practice.java8.javatechonline;

// How to count occurrences of each character of a String in Java 8?

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceOfChar {
    public static void main(String[] args) {
        String someString = "JAVA PROGRAMMER";
        System.out.println("Original string: " + someString);
        char[] strArray = someString.toCharArray();

        //getting distinct characters in strArray
        Set<Character> set = new TreeSet<>();
        for (char c : strArray){
            set.add(c);
        }
        //set.forEach(System.out::println);

        for (char c : set) {
            // Using Streams & Lambda Expressions in Java 8
            long count = someString.chars().filter(ch -> ch == c).count();
            System.out.println("Occurrences of Character '" +c+ "' : " +count);
        }

        // using stream api
        Map<Character, Long> count = someString.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(count);
    }
}
