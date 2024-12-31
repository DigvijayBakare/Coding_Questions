package practice.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Part_2_1To5 {
    public static void main(String[] args) {
//        que1();     // Implement a method to calculate the Fibonacci sequence using Java streams
//        que2();     // Find the median of a list of integers using Java streams
//        que3();     // Given a list of strings, find the longest common prefix using Java streams
//        que4();     // Find the maximum product of two integers in an array using Java streams
        que5();     // Implement a method to find all anagrams in a list of strings using Java streams
    }

    private static void que1() {
        /// Implement a method to calculate the Fibonacci sequence using Java streams
        LongStream fibonacci = Stream.iterate(
                new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]}).mapToLong(f -> f[0]);

        // printing first 10 fibonacci numbers
        fibonacci.limit(10).forEach(System.out::println);
    }

    private static void que2() {
        /// Find the median of a list of integers using Java streams
        List<Integer> numbers = Arrays.asList(5, 2, 1, 3, 4);
        System.out.println("Original list: " + numbers);

        /*int median = numbers.stream().sorted().mapToInt(Integer::intValue)
                .collect(IntStatistics.summaryStatistics())
                .getMedian();*/

        double median = calculateMedian(numbers).orElse(0);
        System.out.println("Median: " + median);
    }

    private static void que3() {
        /// Given a list of strings, find the longest common prefix using Java streams
        List<String> strings = Arrays.asList("flower", "flow", "flight");
        String longestCommonPrefix = strings.stream().reduce((s1, s2) -> {
            int length = Math.min(s1.length(), s2.length());
            int i = 0;
            while (i < length && s1.charAt(i) == s2.charAt(i)) {
                i++;
            }
            return s1.substring(0, i);
        }).orElse("");
        System.out.println("Longest common prefix: " + longestCommonPrefix);
    }

    private static void que4() {
        /// Find the maximum product of two integers in an array using Java streams
        int[] array = {1, 4, 3, 6, 2, 7, 8};
        System.out.println("Original array: " + Arrays.toString(array));

        // finding maximum product
        Integer maximumProduct = IntStream.range(0, array.length).mapToObj(i -> IntStream.range(i + 1, array.length)
                        .map(j -> array[i] * array[j]).max().orElse(Integer.MIN_VALUE))
                .max(Integer::compare).orElse(Integer.MIN_VALUE);
        System.out.println("Maximum product: " + maximumProduct);
    }

    private static void que5() {
        /// Implement a method to find all anagrams in a list of strings using Java streams
        List<String> words = Arrays.asList("listen", "silent", "hello", "world", "night", "thing");
        System.out.println("Original list: " + words);

        // anagram strings
        Map<String, List<String>> anagrams = words.stream().collect(Collectors.groupingBy(s -> {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }));
        System.out.println("Anagrams: " + anagrams);
    }

    private static OptionalDouble calculateMedian(List<Integer> numbers) {
        // Sort the numbers and collect them into a new list
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList()); // Collect sorted numbers into a list

        int size = sortedNumbers.size();
        if (size == 0) {
            return OptionalDouble.empty(); // Return empty if there are no elements
        }

        if (size % 2 == 1) {
            // If odd, return the middle element
            return OptionalDouble.of(sortedNumbers.get(size / 2));
        } else {
            // If even, return the average of the two middle elements
            double medianValue = (sortedNumbers.get(size / 2 - 1) + sortedNumbers.get(size / 2)) / 2.0;
            return OptionalDouble.of(medianValue);
        }
    }
}