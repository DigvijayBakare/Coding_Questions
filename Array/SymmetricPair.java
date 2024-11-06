package TCS_NQT.Array;

import java.util.Arrays;

// Que: Find all symmetric pairs in an array

public class SymmetricPair {
    public static void main(String[] args) {
        // declare and print an integer array
        int[] arr = {2, 2, 6, 8, 9, 7, 1, 3, 5, 3, 9};
        System.out.println("Original array: " + Arrays.toString(arr));

        // find all symmetric pairs
        int first = 0;
        int last = 0;
        System.out.println("The symmetric pairs are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    first = arr[i];
                    last = arr[j];
                    System.out.println("(" + first + ", " + last + ")");
                }
            }
        }

    }
}
