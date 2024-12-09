package java8collection;

// Write a program to sort an ArrayList of Strings alphabetically.

import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortingArrayList {
    public static void main(String[] args) {
        // declare and print an ArrayList
        List<String> list = List.of("java", "is", "a", "programming", "language", "bravo", "null");
        ArrayList<String> arrayList1 = new ArrayList<>(list);
        ArrayList<String> arrayList2 = new ArrayList<>(list);
        System.out.println("Original List: " + arrayList1);

        // sort the list alphabetically
        // using collections class
        Collections.sort(arrayList1);
        System.out.println("Sorted using collection: " + arrayList1);

        // using java 8 - stream api
        List<String> streamList = arrayList2.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted using java 8: " + streamList);

        // reversed sorting
        arrayList1.sort((s1,s2)->s2.compareTo(s1));
        System.out.println("Reversed sort using collection: " + arrayList1);

        List<String> reversed = arrayList2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Reversed sort using stream api" + reversed);
    }
}
