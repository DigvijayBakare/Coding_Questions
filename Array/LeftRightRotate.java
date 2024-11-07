package TCS_NQT.Array;

// Que: Rotate the elements of an array (left and right)

import java.util.Arrays;

public class LeftRightRotate {
    // Method to right rotate the array by d positions
    public static void rightRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Handle cases where d >= n
        reverse(arr, n - d, n - 1); // Reverse last d elements
        reverse(arr, 0, n - d - 1); // Reverse first n-d elements
        reverse(arr, 0, n - 1); // Reverse the whole array
    }

    // Method to left rotate the array by d positions
    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Handle cases where d >= n
        reverse(arr, 0, d - 1); // Reverse first d elements
        reverse(arr, d, n - 1); // Reverse remaining elements
        reverse(arr, 0, n - 1); // Reverse the whole array
    }

    // Helper method to reverse a portion of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // declare and print an integer array
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr1));

        // right rotate
        int d = 2;          // Number of positions to rotate
        rightRotate(arr1, d);
        System.out.println("Array after right rotate with " + d + " elements: " + Arrays.toString(arr1));

        // left rotate
//        int d = 2;          // Number of positions to rotate
        leftRotate(arr2, d);
        System.out.println("Array after left rotate with " + d + " elements: " + Arrays.toString(arr2));
    }
}
