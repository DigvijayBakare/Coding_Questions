package TCS_NQT.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Que: Rearrange the array in increasing-decreasing order.

public class IncreaseAndDecreaseOrder {
    public static void main(String[] args) {
        // declare and print an integer array
        Integer[] arr = {6, 4, 2, 9, 8, 1, 3, 7, 10, 5};
        System.out.println("Original array: " + Arrays.toString(arr));

        // arranging the array in increasing order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("After sorting in increasing order: " + Arrays.toString(arr));

        // arranging the array in decreasing order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("After sorting in decreasing order: " + Arrays.toString(arr));

        // Using stream api
        List<Integer> increasingList = Arrays.asList(arr).stream().sorted().collect(Collectors.toList());
        System.out.println("Using stream in increasing order: " + increasingList);
        Comparator<Integer> c = (a, b) -> b.compareTo(a);
        List<Integer> decreasingList = Arrays.asList(arr).stream().sorted(c).collect(Collectors.toList());
        System.out.println("Using stream in descending order: " + decreasingList);
    }
}
