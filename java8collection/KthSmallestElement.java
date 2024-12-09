package java8collection;

// Write a program to find the kth smallest element in an ArrayList.

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElement {
    public static void main(String[] args) {
        // declare and print an arraylist
        ArrayList<Integer> arrList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Original list: " + arrList);

        // finding kth smallest element
        int k = 2;
        Integer i = arrList.stream().sorted().skip(k-1).findFirst().get();
        System.out.println("The " + k + "th smallest element in the list: " + i);
    }
}
