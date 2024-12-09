package java8collection;

// Write a program to find the intersection of multiple Sets.

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfMultipleSets {
    public static void main(String[] args) {
        // declare and print multiple sets
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(List.of(4, 5, 6, 7));
        Set<Integer> set3 = new HashSet<>(List.of(4, 7, 8, 9));
        Set<Integer> set4 = new HashSet<>(List.of(4, 2, 7, 8));
        System.out.println("Set 1: " + set1 + "\n" +
                "Set 2: " + set2 + "\n" +
                "Set 3: " + set3 + "\n" +
                "Set 4: " + set4);

        // intersection of multiple sets
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        intersection.retainAll(set3);
        intersection.retainAll(set4);

        System.out.println("Intersection of the sets: " + intersection);
    }
}
