package java8collection;

// Write a program to find the frequency of each element in an ArrayList.

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfElement {
    public static void main(String[] args) {
        // declare and print an arraylist
        ArrayList<Integer> arrList = new ArrayList<>(List.of(5, 3, 9, 5, 3, 9, 8, 7, 8, 1, 0, 5, 7, 9, 4, 1, 0, 3, 6, 9, 4, 1, 6, 4, 2, 8, 7, 10, 15));
        System.out.println("Original arraylist: " + arrList);

        // frequency of each element
        Map<Integer, Long> count = arrList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        count.forEach((n,c) -> {
            System.out.println(n + " has occurred " + c + " times");
        });
    }
}
