package TCS_NQT.Array;

import java.util.Arrays;

// Que: Find the maximum product sub-array in an array

public class ProductSubArray {
    public static void main(String[] args) {
        // declare and print an integer array
        Integer[] arr = {1, 6, 8, 2, 9, 5, 7, 3, 4, 10};
        System.out.println("Original array: " + Arrays.toString(arr));

        // create a sub-array for the original array
        int first = 0, last = 0;
        int maxProd = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > first) first = arr[i];

                if (arr[j] > last) last = arr[j];

                if ((first * last) > maxProd) maxProd = first * last;
            }
        }
        System.out.println("The maximum product sub-array in the given array: " +
                "(" + first + ", " + last + ")" + " = " + maxProd);
    }
}
