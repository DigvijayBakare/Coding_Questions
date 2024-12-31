package practice.java8.streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Part_2_6To10 {
    public static void main(String[] args) {
//        que6();     // Given a list of intervals, find the total covered length using Java streams
//        que7();     // Find the number of occurrences of a given character in a list of strings using Java streams
//        que8();     // Given a list of integers, find all pairs of numbers that sum up to a given target using Java streams
//        que9();     // Given a list of integers, find all non-duplicate integers using Java streams
        que10();     // Given a list of strings, find the longest string using Java streams
    }

    private static void que6() {
        /// Given a list of intervals, find the total covered length using Java streams
        List<Interval> intervals = Arrays.asList(new Interval(1, 3),
                new Interval(5, 8), new Interval(10, 12));
        int totalCoveredLength = intervals.stream().mapToInt(i -> i.getEnd() - i.getStart())
                .sum();
        System.out.println("Total covered length: " + totalCoveredLength);
    }

    private static void que7() {
        /// Find the number of occurrences of a given character in a list of strings using Java streams
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "melon");
        System.out.println("Original list: " + strings);
        char target = 'a';

        long count = strings.stream().flatMapToInt(CharSequence::chars).filter(c -> c == target).count();
        System.out.println("Occurrence of " + target + ": " + count);
    }

    private static void que8() {
        /// Given a list of integers, find all pairs of numbers that sum up to a given target using Java streams
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        System.out.println("Original list: " + numbers);
        int target = 12;

        Set<String> pairs = numbers.stream().flatMap(i -> numbers.stream()
                        .map(j -> i + j == target ? "(" + i + ", " + j + ")" : ""))
                .filter(s -> !s.isEmpty()).collect(Collectors.toSet());
        System.out.println("Pairs that sums up to " + target + ": " + pairs);
    }

    private static void que9() {
        /// Given a list of integers, find all non-duplicate integers using Java streams
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 6, 4, 7, 8, 9, 9);
        System.out.println("Original list: " + numbers);

        // find occurrence
        Map<Integer, Long> occurrence = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // now find non-duplicate elements
        numbers.stream().filter(n -> occurrence.get(n)==1).forEach(System.out::println);
    }

    private static void que10() {
        /// Given a list of strings, find the longest string using Java streams
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        System.out.println("Original list: " + strings);

        // longest string in the list
        String longest = strings.stream().max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println("Longest string in the given list: " + longest);
    }
}

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}