package practice.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Part_1_6To10 {
    public static void main(String[] args) {
//        que6();     // Remove duplicates from a list while preserving the order using Java streams
//        que7();     // Given a list of transactions, find the sum of transaction amounts for each day using Java streams
//        que8();     // Find the kth smallest element in an array using Java streams
//        que9();     // Given a list of strings, find the frequency of each word using Java streams
        que10();    // Implement a method to partition a list into two groups based on a predicate using Java streams
    }

    private static void que6() {
        /// Remove duplicates from a list while preserving the order using Java streams
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        System.out.println("Original list: " + numbersWithDuplicates);

        // remove duplicates
        List<Integer> uniqueElements = numbersWithDuplicates.stream().distinct().collect(Collectors.toList());
        System.out.println("List of unique elements: " + uniqueElements);
    }

    private static void que7() {
        /// Given a list of transactions, find the sum of transaction amounts for each day using Java streams
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500)
        );
        Map<String, Integer> sum = transactions.stream().collect(Collectors.groupingBy(Transaction::getDate, Collectors.summingInt(Transaction::getAmount)));
        System.out.println("The sum of transaction for each day: " + sum);
    }

    private static void que8() {
        /// Find the kth smallest element in an array using Java streams
        int[] array = {4, 2, 7, 1, 5, 3, 6};
        System.out.println("Original array: " + Arrays.toString(array));
        int k = 3;

        // Find the kth smallest element
        int kthSmallest = Arrays.stream(array).sorted().skip(k - 1).findFirst().orElse(0);
        System.out.println("The " + k + "th smallest element in the list: " + kthSmallest);
    }

    private static void que9() {
        /// Given a list of strings, find the frequency of each word using Java streams
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
        System.out.println("Original list of words: " + words);

        // find the frequency
        Map<String, Long> frequency = words.stream().collect(Collectors.groupingBy((s -> s), Collectors.counting()));
        System.out.println("The frequency of each word: \n" + frequency);
    }

    private static void que10() {
        /// Implement a method to partition a list into two groups based on a predicate using Java streams
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10);
        System.out.println("Original list: " + numbers);

        // partitioning the list
        Map<Boolean, List<Integer>> partitioned = numbers.stream().collect(Collectors.partitioningBy((i -> i % 2 == 0)));
        System.out.println("The partitioned list: \n" + partitioned);
    }
}

// Transaction class
class Transaction {
    String date;
    int amount;

    public Transaction(String date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}