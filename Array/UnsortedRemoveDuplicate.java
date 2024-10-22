package TCS_NQT.Array;

import java.util.Arrays;

public class UnsortedRemoveDuplicate {
    public static void main(String[] args) {
        // Declare and print an integer array
        Integer[] arr = {1, 5, 2, 5, 3, 9, 4, 6, 2, 3, 8, 7, 6, 2, 1, 10};
        System.out.println("Original unsorted array: " + Arrays.toString(arr));

        // sorting
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++)
                if (arr[i] == arr[j]) {
                    int temp = arr[length - 1];
                    arr[length - 1] = arr[j];
                    arr[j] = temp;
                    length--;
                    i--;
                }
        }
        Integer[] not = Arrays.copyOf(arr, length);
        System.out.println("Unsorted unique array: " + Arrays.toString(not));
    }
}