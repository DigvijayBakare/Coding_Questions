package TCS_NQT.Array;

// Que: Find the median of the given array

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MedianOfArray {
    public static void main(String[] args) {
        // declare and print an integer array
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original array: " + Arrays.toString(arr));

        // median of given array
        Arrays.sort(arr);
        int n = arr.length;

        if (n % 2 != 0) {
            System.out.println("The median of the given array: " + arr[n / 2]);
        } else {
            double i = (double) (arr[(n / 2) - 1] + arr[(n / 2)]) / 2;
            System.out.println("The median of the given array: " + i);
        }

        // using stream api
        List<Integer> list = Arrays.stream(arr).sorted().collect(Collectors.toList());
        int num = list.size();
        if (num % 2 != 0) {
            System.out.println("The median of the given array using stream api: " + list.get(num/2));
        } else {
            double i = (double) (list.get((num/2)-1)+ (list.get(num/2))) / 2;
            System.out.println("The median of the given array using stream api: " + i);
        }
    }
}
