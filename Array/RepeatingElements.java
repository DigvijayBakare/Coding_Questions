package TCS_NQT.Array;

// Que: Find all repeating elements in an array

import java.util.Arrays;

public class RepeatingElements {
    public static void main(String[] args) {
        // declare and print an integer array
        int[] arr = {1, 2, 2, 3, 3, 4, 5, 6, 6, 8, 9, 7, 5, 9, 10};
        System.out.println("Original array: " + Arrays.toString(arr));

        // repeating elements
        System.out.print("Repeating elements: ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");
                    count++;
                }
            }
        }
        System.out.println("\nThere are " + count + " repeating numbers in the given array.");
    }
}
