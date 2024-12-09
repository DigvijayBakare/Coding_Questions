package java8collection;

// Write a program to check if a HashSet is a subset of another HashSet.

import java.util.HashSet;
import java.util.Set;

public class SubSetOfHashSet {
    public static void main(String[] args) {
        // declare and print two hashsets
        HashSet<Integer> set1 = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        HashSet<Integer> set2 = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        System.out.println("Set 1: " + set1 + "\n" + "Set 2: " + set2);

        // is subset
        boolean subset = set1.containsAll(set2);
        System.out.println("Is the set 2 is subset of set 1: " + subset);
    }
}
