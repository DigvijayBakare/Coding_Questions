package TCS_NQT.Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Que: Find the average of all elements in an array

public class AvgOfElements {
    public static void main(String[] args) {
        // Declare and print an integer array
        Integer[] arr = {11, 66, 55, 22, 33, 99, 77, 44, 88};
        System.out.println("Original array: " + Arrays.toString(arr));

        // average of elements
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double avg = sum / arr.length;
        System.out.println("The average of elements in the array: " + avg);

        // using stream api
        List<Integer> list = Arrays.asList(arr);
        double average = list.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println("The average of elements using stream api: " + average);
    }
}
