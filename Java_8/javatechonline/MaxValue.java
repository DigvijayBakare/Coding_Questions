package practice.java8.javatechonline;

// How to find the maximum value in a list of integers using Stream & Method Refrerence?

import java.util.Arrays;
import java.util.List;

public class MaxValue {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 42, 36, 54, 35);
        System.out.println("Original list: " + numbers);

        Integer max = numbers.stream().max(Integer::compareTo).orElse(0);
        Integer min = numbers.stream().min(Integer::compareTo).orElse(0);
        System.out.println("Maximum number in the list: " + max);
        System.out.println("Minimum number in the list: " + min);
    }
}

