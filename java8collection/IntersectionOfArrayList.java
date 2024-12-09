package java8collection;

// Write a program to find the intersection of two ArrayLists.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOfArrayList {
    public static void main(String[] args) {
        // declare and print two arraylist of integer
        ArrayList<Integer> arrList1 = new ArrayList<>(List.of(5, 3, 9, 1, 6, 4, 2, 8, 7, 10, 15));
        ArrayList<Integer> arrList2 = new ArrayList<>(List.of(8, 2, 6, 4, 9, 10, 22));
        System.out.println("ArrayList 1: " + arrList1);
        System.out.println("ArrayList 2: " + arrList2);

        // intersection in the list
        List<Integer> collect = arrList1.stream().filter(arrList2::contains).collect(Collectors.toList());
        System.out.println("Intersection using stream api: " + collect);

        List<Integer> intersection = new ArrayList<>();
        for (int i = 0; i < arrList1.size(); i++) {
            if (arrList2.contains(arrList1.get(i))) {
                intersection.add(arrList1.get(i));
            }
        }
        System.out.println("Intersection using collection: " + intersection);
    }
}
