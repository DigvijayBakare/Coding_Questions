package java8collection;

// Write a program to remove all duplicate elements from an ArrayList.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        // declare and print arraylist
        List<Integer> list = List.of(5, 3, 9, 1, 6, 4, 2, 8, 8, 9, 1, 3, 6, 4, 2, 5, 9, 7, 7, 10, 15);
        ArrayList<Integer> arrList = new ArrayList<>(list);
        System.out.println("Original ArrayList: " + arrList);

        // remove duplicates
        Set<Integer> set = new HashSet<>(arrList);
        System.out.println("Removed duplicates using set interface of collection: " + set);

        List<Integer> collect = arrList.stream().distinct().collect(Collectors.toList());
        System.out.println("Removed duplicates using distinct method of stream api: " + collect);
    }
}
