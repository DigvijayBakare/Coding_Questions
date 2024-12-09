package java8collection;

// Write a program to find the second-largest element in an ArrayList of Integers.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SecondLargestElement {
    public static void main(String[] args) {
        // declare and print an ArrayList of integers
        ArrayList<Integer> arrList1 = new ArrayList<>(List.of(5, 3, 9, 1, 6, 4, 2, 8, 7, 10, 15));
        System.out.println("Original list: " + arrList1);

        // second-largest element in the list
        arrList1.sort(Comparator.reverseOrder());
        System.out.println("Second_Largest element in the list using collections: " + arrList1.get(1));

        Integer second_largest = arrList1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second_Largest element in the list using stream api: " + second_largest);
    }
}
