package TCS_NQT.Array;

import java.util.Arrays;
import java.util.HashMap;

// Que: Replace each element of the array by its rank in the array.

public class RankReplace {
    public static void main(String[] args) {
        // declare and print an integer array
        int[] arr = {18, 36, 25, 98, 75, 46, 57, 63, 82, 46};
        System.out.println("Original array: " + Arrays.toString(arr));

        // replace the element by its rank in the array.
        replaceWithRank(arr);
        System.out.println("After replacing with rank : " + Arrays.toString(arr));
    }

    public static void replaceWithRank(int[] arr) {
        // Create a copy of the original array
        int n = arr.length;
        int[] sortedArray = arr.clone();

        // Sort the copied array
        Arrays.sort(sortedArray);

        // Create a HashMap to store the rank of each unique element
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1; // Start ranking from 1

        for (int i = 0; i < n; i++) {
            // Only assign rank if it's the first occurrence of the element
            if (!rankMap.containsKey(sortedArray[i])) {
                rankMap.put(sortedArray[i], rank++);
            }
        }

        // Replace elements in the original array with their ranks
        for (int i = 0; i < n; i++) {
            arr[i] = rankMap.get(arr[i]);
        }
    }
}
