package TCS_NQT.Array;

// Que: Count the frequency of each element in an array

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfElement {
    public static void main(String[] args) {
        // declare an integer array and print it
        Integer[] arr = {15, 86, 34, 92, 53, 77, 21, 48, 69, 15, 86, 3, 69, 15, 86, 34, 92, 53, 77, 21, 48, 69};
        System.out.println("Original list: " + Arrays.toString(arr));

        // count the frequency of each element
        boolean[] bArray = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (!bArray[i]) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        bArray[j] = true;
                    }
                }
                System.out.println(arr[i] + " has appeared " + count + " times");
            }
        }
        System.out.println("-------------------------------------------------------");

        // stream api
        List<Integer> list = Arrays.asList(arr);
        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        map.forEach((key, value) -> System.out.println(key + " has appeared " + value + " times"));
    }
}
