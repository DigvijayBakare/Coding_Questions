package TCS_NQT.Array;

import java.util.Arrays;

// Que: Rotate an array by k elements - Block swap Algorithm

public class ArrayRotate {
    /**
     * Here, a = the starting index of the first block
     * b = the starting index of the second block
     * k = the number of elements to swap
     **/
    public static void swap(int[] arr, int a, int b, int k) {
        for (int i = 0; i < k; i++) {
            int temp = arr[a + i];
            arr[a + i] = arr[b + i];
            arr[b + i] = temp;
        }
    }

    /**
     * Here, k = The number of position to rotate
     * n = The total number of elements in the array
     **/
    public static void blockSwap(int[] arr, int k, int n) {
        if (k == 0 || k == n) return;       // If k is 0 or equal to n, no rotation is needed, and we return.

        /* If k is equal to n−k, it means both halves of the array are equal in size.
         * We can simply swap these halves using the swap method. */
        if (k == n - k) {
            swap(arr, 0, n - k, k);
            return;
        }

        /**
         * If k < n-k => swap first k with last k elements, then recursively call the blockSwap for remaining
         * part of the array (from index k to n-k).
         * If k > n-k => swap first n-k with last n-k elements from the end, then recursively call the blockSwap
         * for remaining part of the array.
         **/
        if (k < n - k) {
            swap(arr, 0, n - k, k);
            blockSwap(arr, k, n - k);
        } else {
            swap(arr, 0, k, n - k);
            blockSwap(arr, n - k, 2 * k - n);
        }
    }

    // Method to rotate the array
    public static void rotate(int[] arr, int k) {
        // declare a length and the position of the rotation
        int n = arr.length;
        if (n == 0) return;
        // Handle cases where k is greater than n
        k = k % n;
        blockSwap(arr, k, n);
    }

    public static void main(String[] args) {
        // declare and print an integer array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original array: " + Arrays.toString(arr));

        int k = 2;
        rotate(arr, k);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
