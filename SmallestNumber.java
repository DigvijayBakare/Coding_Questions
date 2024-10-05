package TCS_NQT.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

// Que: Find the smallest number in the array

public class SmallestNumber {
    public static void main(String[] args) {
        // Declare and print the integer array
        Integer[] arr = {45, 21, 32, 89, 12, 75, 95, 56, 63};
        System.out.println("Original integer array: " + Arrays.toString(arr));

        // Find the smallest number in the array
        // 1.
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("The smallest number in the list: " + smallest);

        // 2.
        List<Integer> list = Arrays.asList(arr);
        int small = Collections.min(list);
        System.out.println("The smallest number in the list: " + small);

        // 3.
        Optional<Integer> smaller = list.stream().sorted().min((a, b) -> a - b);
        System.out.println("The smallest number in the list: " + smaller.get());
    }
}
