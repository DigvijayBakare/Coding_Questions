package TCS_NQT.Array;

import java.util.Arrays;
import java.util.List;

// Que: Add an element in the array

public class AddElement {
    public static void main(String[] args) {
        // declare and print an integer array
        int[] arr = new int[10];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        System.out.println("Original array: " + Arrays.toString(arr));

        // add element to the array
        arr[5] = 5;
        arr[6] = 6;
        System.out.println("After adding an element: " + Arrays.toString(arr));
    }
}
