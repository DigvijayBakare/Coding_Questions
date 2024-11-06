package TCS_NQT.Array;

import java.util.Arrays;

// Que: Sort an array according to the order defined by another array

public class SortedByAnotherArray {
    public static void main(String[] args) {
        // declare two arrays and print them
        int[] arr1 = {1, 5, 3, 6, 2, 7, 9, 8, 4, 10};
        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("First array: " + Arrays.toString(arr1));
        System.out.println("Second array: " + Arrays.toString(arr2));

        // first check the order of the second array - ascending or descending
        boolean isAscending = true;
        for (int i = 0; i < arr2.length - 1; i++) {
            if (arr2[i] > arr2[i + 1]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is sorted in descending order");
        }

        // sort the first arrays according to the order of second array
        if (isAscending) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = i + 1; j < arr2.length; j++) {
                    if (arr1[i] > arr1[j]) {
                        int temp = arr1[j];
                        arr1[j] = arr1[i];
                        arr1[i] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = i + 1; j < arr2.length; j++) {
                    if (arr1[i] < arr1[j]) {
                        int temp = arr1[j];
                        arr1[j] = arr1[i];
                        arr1[i] = temp;
                    }
                }
            }
        }
        System.out.println("After sorting the first array according to the order of second array: ");
        System.out.println(Arrays.toString(arr1));
    }
}
