package TCS_NQT.Array;

import java.util.Arrays;

// Que: Check if an array is a subset of another array or not

public class SubSetArray {
    public static void main(String[] args) {
        // declare and print two integer array
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {5, 2, 3};
        System.out.println("First array: " + Arrays.toString(arr1));
        System.out.println("Second array: " + Arrays.toString(arr2));

        // check if the second array is subset of first
        int flag = Arrays.compare(arr1, arr2);
        if (flag>0){
            System.out.println("The given second array is subset of the first array? " + true);
        }else System.out.println("The given second array is subset of the first array? " + false);
    }
}
