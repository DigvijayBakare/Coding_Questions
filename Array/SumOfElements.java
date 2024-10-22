package TCS_NQT.Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Que: Calculate the sum of the elements of the array.

public class SumOfElements {
    public static void main(String[] args) {
        // declare and print an integer array
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original array: " + Arrays.toString(arr));

        // sum of all elements of the array
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Sum of all elements of the given array: " + sum);

        // Using stream api
        List<Integer> list = Arrays.asList(arr);
        int sumOfElements = list.stream().mapToInt(a -> a).sum();
        System.out.println("Using stream api the sum of elements of the given array: " + sumOfElements);
    }
}
