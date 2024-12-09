package java8collection;

// Create a LinkedList and perform various operations like add, remove, and iterate over it.

import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        // create a LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // adding elements to the linked list
        list.add(1);
        list.add(10);
        list.add(6);
        list.add(8);
        list.add(2);
        list.add(7);
        list.add(9);
        list.add(4);

        // printing the list after adding the elements
        System.out.println("Original linked list: " + list);

        list.remove(1);
        list.remove(3);
        System.out.println("LinkedList after removing elements: " + list);

        // iterating over an linked list
        System.out.println("Iterating over the list: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
