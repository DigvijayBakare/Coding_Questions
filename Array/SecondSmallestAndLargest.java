package TCS_NQT.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// Que: Find the second smallest and second-largest element in an array

public class SecondSmallestAndLargest {
    public static void main(String[] args) {
        // declare an integer array and print it
        Integer[] arr = {15, 86, 34, 92, 53, 77, 21, 48, 69};
        System.out.println("Original list: " + Arrays.toString(arr));

        // finding the second-smallest number in the list
        List<Integer> list = Arrays.asList(arr);
        Optional<Integer> secSmall = list.stream().sorted().skip(1).min(Comparator.naturalOrder());
        System.out.println("The second-smallest number in the list: " + secSmall.get());
    }
}
