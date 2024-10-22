package TCS_NQT.Array;

// Que: Reverse a given array

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseAnArray {
    public static void main(String[] args) {
        // declare an integer array and print it
        Integer[] arr = {15, 86, 34, 92, 53, 77, 21, 48, 69};
        System.out.println("Original list: " + Arrays.toString(arr));

        // 1
        System.out.print("Reversed list: ");
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 2
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);
    }
}
