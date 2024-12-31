package practice.java8.streamapi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Medium_8To14 {
    public static void main(String[] args) {
//        que8();     // Given a String, find the first repeated character in it using Stream functions?
//        que9();     // Given a list of integers, sort all the values present in it using Stream functions?
//        que10();     // Given a list of integers, sort all the values present in it in descending order using Stream functions?
//        que11();     // Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//        que12();     // How will you get the current date and time using Java 8 Date and Time API?
//        que13();     // Write a Java 8 program to concatenate two Streams?
        que14();     // Java 8 program to perform cube on list elements and filter numbers greater than 50.
    }

    private static void que8() {
        /// Given a String, find the first repeated character in it using Stream functions?
        String string = "Java Articles are Awesome";
        System.out.println("Origin string: " + string);

        // first repeating character
        Set<Character> set = new HashSet<>();
        Character character = string.chars().mapToObj(c -> (char) c).filter(ch -> !set.add(ch))
                .findFirst().get();
        System.out.println("First repeating character: " + character);
    }

    private static void que9() {
        /// Given a list of integers, sort all the values present in it using Stream functions?
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        System.out.println("Original list: " + myList);

        // sort the list
        List<Integer> sorted = myList.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list: " + sorted);
    }

    private static void que10() {
        /// Given a list of integers, sort all the values present in it in descending order using Stream functions?
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        System.out.println("Original list: " + myList);

        // sort the list
        List<Integer> sorted = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted list in descending order: " + sorted);
    }

    private static void que11() {
        /// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        System.out.println("Original list: " + list);

        Set<Integer> set = new HashSet<>(list);
        if (set.size() == list.size())
            System.out.println("Every  or at lest one element in the list is distinct: " + true);
        else System.out.println("Every or at lest one element in the list is distinct: " + false);

        // using stream
        Set<Integer> setData = new HashSet<>(list);
        boolean b = false;
        b = list.stream().anyMatch(i -> !setData.add(i));
        if (!b) System.out.println("Every or at lest one element in the list is duplicate: " + true);
        else System.out.println("Every or at lest one element in the list is duplicate: " + false);
    }

    private static void que12() {
        /// How will you get the current date and time using Java 8 Date and Time API?
        // using LocalDate API to get the date
        System.out.println("Current local date: " + java.time.LocalDate.now());

        // using LocalTime API to get the time
        System.out.println("Current local time: " + java.time.LocalTime.now());

        // using LocalDateTime API to get both the data and time
        System.out.println("Current local date and time: " + java.time.LocalDateTime.now());
    }

    private static void que13() {
        /// Write a Java 8 program to concatenate two Streams?
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");
        System.out.println("Two separate lists: \nList 1 " + list1 + "\nList 2: " + list2);

        // concatenating two streams using list
        List<String> concatinated = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
        System.out.println("Two concatinated streams: " + concatinated);
    }

    private static void que14() {
        /// Java 8 program to perform cube on list elements and filter numbers greater than 50.
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        System.out.println("Original list: " + integerList);

        // cubing and filtering the elements of the list
        List<Integer> collect = integerList.stream().map(i -> i * i * i).filter(i -> i > 50).collect(Collectors.toList());
        System.out.println("The elements greater than 50: " + collect);
    }
}
