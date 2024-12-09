package java8collection;

// Write a program to shuffle the elements of an ArrayList.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleElementsInList {
    public static void main(String[] args) {
        // declare and print an arrayList
        ArrayList<Integer> arrList1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        System.out.println("Original array list: " + arrList1);

        // shuffle the elements
        Collections.shuffle(arrList1);
        System.out.println("After shuffling the list: " + arrList1);
    }
}
