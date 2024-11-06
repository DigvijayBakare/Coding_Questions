package TCS_NQT.Array;

import java.util.Arrays;

// Que: Search for an element in an array

public class SearchInArray {
    public static void main(String[] args) {
        // declare and print an integer array
        int[] arr = {15, 6, 8, 7, 2, 9, 84, 31, 16, 54, 48};
        System.out.println("Original array: " + Arrays.toString(arr));

        // searching an element in the given array
        int e = 15;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int present = Arrays.binarySearch(arr, e);
        if (present>0){
            System.out.println("The element you are searching for is present in the array at " + present + " position");
        } else {
            System.out.println("The element you are searching for is not present in the array but can be inserted at " + present + " position");
        }
    }
}
