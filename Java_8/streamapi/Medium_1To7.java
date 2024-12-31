package practice.java8.streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Medium_1To7 {
    public static void main(String[] args) {
//        que1();     // Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
//        que2();     // Given a list of integers, find out all the numbers starting with 1 using Stream functions?
//        que3();     // How to find duplicate elements in a given integers list in java using Stream functions?
//        que4();     // Given the list of integers, find the first element of the list using Stream functions?
//        que5();     // Given a list of integers, find the total number of elements present in the list using Stream functions?
//        que6();     // Given a list of integers, find the maximum value element present in it using Stream functions?
        que7();     // Given a String, find the first non-repeated character in it using Stream functions?

    }

    private static void que1() {
        /// Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        System.out.println("Original list: " + list);
        List<Integer> evenNumber = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Even number in the list: " + evenNumber);
    }

    private static void que2() {
        /// Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 18, 20);
        System.out.println("Original list: " + list);

        List<String> startingWithOne = list.stream().map(s -> s + "").filter(s -> s.startsWith("1")).collect(Collectors.toList());
        System.out.println("The list of numbers starting from 1: " + startingWithOne);
    }

    private static void que3() {
        /// How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> list1 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Set<Integer> set = new HashSet();
        list1.stream().filter(n -> !set.add(n)).forEach(System.out::println);
        System.out.println();

        // Or you can also try using distinct() keyword
        List<Integer> list2 = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
        list2.stream().distinct().forEach(noDuplicateData -> System.out.println(noDuplicateData));

        // Another way of doing this is
        int[] arr = {1, 2, 3, 6, 52, 1, 4, 2, 3, 6, 121, 42, 3, 3, 6, 14, 1, 2, 3, 5, 14, 12, 3, 6, 1, 12, 5, 7};
        List<Integer> list = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
        System.out.println("Unique element list: " + list);
    }

    private static void que4() {
        /// Given the list of integers, find the first element of the list using Stream functions?
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        myList.stream().findFirst().ifPresent(System.out::println);

        int[] arr = {5, 1, 2, 3, 6, 4, 8, 9, 7, 10};
        System.out.println("Original array: " + Arrays.toString(arr));
        Integer first = Arrays.stream(arr).boxed().findFirst().orElse(0);
        System.out.println("First number in the given array: " + first);
    }

    private static void que5() {
        /// Given a list of integers, find the total number of elements present in the list using Stream functions?
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        System.out.println("Original list: " + myList);
        long count = myList.stream().count();
        System.out.println("The total number of elements present in the list: " + count);

        // we can use boxed method to directly
    }

    private static void que6() {
        /// Given a list of integers, find the maximum value element present in it using Stream functions?
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        System.out.println("Original list: " + myList);
        int max = myList.stream().max(Integer::compare).get();
        int min = myList.stream().min(Integer::compare).get();
        System.out.println("Maximum value element present in list: " + max);
        System.out.println("Minimum value element present in list: " + min);
    }

    private static void que7() {
        /// Given a String, find the first non-repeated character in it using Stream functions?
        String string = "Java articles are Awesome";
        System.out.println("Original string: " + string);

        Character firstNonRepeatingChar = string.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(es -> es.getValue() == 1L).map(entry -> entry.getKey())
                .findFirst().get();
        System.out.println("First non-repeating character: " + firstNonRepeatingChar);

        // another way
        Character firstChar = string.chars().mapToObj(c -> (char) c).filter(ch -> string.indexOf(ch) == string.lastIndexOf(ch))
                .findFirst().get();
        System.out.println("First non-repeating character: " + firstChar);
    }
}
