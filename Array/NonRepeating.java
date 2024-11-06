package TCS_NQT.Array;

// Que: Find all non-repeating elements in an array

import java.util.Arrays;

public class NonRepeating {
    public static void main(String[] args) {
        // declare and print an integer array
        int[] arr = {1, 2, 2, 3, 3, 4, 5, 6, 6, 8, 9, 7, 5, 9, 10};
        System.out.println("Original array: " + Arrays.toString(arr));

        // non-repeating elements
        System.out.print("Non-Repeating elements: ");
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
//                    System.out.print(arr[i] + " ");
                    int temp = arr[len - 1];
                    arr[len - 1] = arr[j];
                    arr[j] = temp;
                    i--;
                    len--;
                }
            }
        }
        int[] arr1 = Arrays.copyOf(arr, len);
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
