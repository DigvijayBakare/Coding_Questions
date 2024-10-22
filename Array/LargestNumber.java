package TCS_NQT.Array;

// Que: Find the largest number in the array

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class LargestNumber {
    public static void main(String[] args) {
        // Declare and print the integer array
        Integer[] arr = {45, 21, 32, 89, 12, 75, 95, 56, 63};
        System.out.println("Original integer array: " + Arrays.toString(arr));

        // Find the largest number in the array
        // 1.
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The largest number in the list: " + largest);

        // 2.
        List<Integer> list = Arrays.asList(arr);
        int large = Collections.max(list);
        System.out.println("The largest number in the list: " + large);

        // 3.
        Optional<Integer> larger = list.stream().sorted().max((a, b) -> a - b);
        System.out.println("The largest number in the list: " + larger.get());
    }
}
