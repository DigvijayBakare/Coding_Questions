package java8collection;

// Write a program to find the maximum element from an ArrayList of Integers.

import java.util.*;

public class MaxElement {
    public static void main(String[] args) {
        // declare and print the ArrayList of Integers
        List<Integer> list = List.of(5, 3, 9, 1, 6, 4, 2, 8, 7, 10, 15);
        ArrayList<Integer> arrList = new ArrayList<>(list);
        System.out.println("Original ArrayList: " + arrList);

        // find maximum element
        Integer max = Collections.max(arrList);
        System.out.println("Maximum number using collections class: " + max);

        Integer max1 = arrList.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Maximum number using stream api: " + max1);

        Integer maxr = arrList.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println("Maximum number using stream api sort method: " + maxr);

        // finding minimum element
        Integer min = Collections.min(arrList);
        System.out.println("Minimum number using collections class: " + min);

        Integer min1 = arrList.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Minimum number using stream api: " + min1);

        Integer minr = arrList.stream().sorted(Comparator.naturalOrder()).findFirst().get();
        System.out.println("Minimum number using stream api sort method: " + minr);
    }
}
