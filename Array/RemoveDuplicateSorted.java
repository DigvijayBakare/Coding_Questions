package TCS_NQT.Array;

// Que: Remove duplicates from a sorted array

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateSorted {
    public static void main(String[] args) {
        // Declare and print an integer array
        Integer[] arr = {1, 2, 2, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9, 10};
        System.out.println("Original sorted array: " + Arrays.toString(arr));

        // remove duplicates
        // using for loop
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    int temp = arr[len - 1];
                    arr[len - 1] = arr[j];
                    arr[j] = temp;
                    len--;
                    i--;
                }
            }
        }
        Integer[] uniqueSorted = Arrays.copyOf(arr, len);
        Arrays.sort(uniqueSorted);
        System.out.println("New Array with unique and sorted elements: " + Arrays.toString(uniqueSorted));

        // using stream api
        List<Integer> list = Arrays.asList(arr);
        System.out.println("Original list: " + list);
        List<Integer> uniqueSort = list.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println("Unique-sorted array using stream api: " + uniqueSort);
    }
}
