package java8collection;

// Write a program to check if two LinkedLists are equal.

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class EqualLinkedLists {
    public static void main(String[] args) {
        // declare and print two linked lists
        LinkedList<Integer> l1 = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        LinkedList<Integer> l2 = new LinkedList<>(List.of(1, 2, 3, 4, 5));

        // check if both the lists are equal or not
        if (Objects.equals(l1.size(), l2.size()) && l1.containsAll(l2)) {
            System.out.println("Are the both lists equal");
        }
    }
}
