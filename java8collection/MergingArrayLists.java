package java8collection;

// Write a program to merge two ArrayLists into a single ArrayList.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergingArrayLists {
    public static void main(String[] args) {
        // declare and print two arraylists
        ArrayList<Integer> arrList1 = new ArrayList<>(List.of(5, 3, 9, 1, 6, 4, 2, 8, 7, 10, 15));
        ArrayList<Integer> arrList2 = new ArrayList<>(List.of(11, 12, 13, 14, 16, 17));
        System.out.println("ArrayList 1: " + arrList1);
        System.out.println("ArrayList 2: " + arrList2);

        // merging the two arraylist
        List<Integer> merged = Stream.concat(arrList1.stream(), arrList2.stream()).collect(Collectors.toList());
        System.out.println("Merged two list using stream api method1: " + merged);

        List<Integer> merged2 = Stream.of(arrList1, arrList2).flatMap(List::stream).collect(Collectors.toList());
        System.out.println("Merged two list using stream api method2: " + merged2);

        arrList1.addAll(arrList2);
        System.out.println("Merged two list using collection: " + arrList1);
    }
}
