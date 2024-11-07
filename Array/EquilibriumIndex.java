package TCS_NQT.Array;

import java.util.Arrays;

// Que: Find the equilibrium index of an array

public class EquilibriumIndex {
    public static int findEquilibriumIndices(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate through the array to find equilibrium indices
        for (int i = 0; i < nums.length; i++) {
            // Right sum is totalSum minus leftSum and current element
            int rightSum = totalSum - leftSum - nums[i];

            // Check if left sum equals right sum
            if (leftSum == rightSum) {
//                System.out.println("Equilibrium index found at: " + i);
                return i;
            }

            // Update left sum for next iteration
            leftSum += nums[i];
        }
        return 0;
    }
    public static void main(String[] args) {
        // declare and print an integer array
        int[] arr = {4, 2, 3, 6, 1, 5, 9, 8, 7, 10};
//        int[] arr = {4,3,1,7,6,8,2,5};
        System.out.println("Original array: " + Arrays.toString(arr));

        // equilibrium index - the sum if elements on right and left side of the element must be same
        int i = findEquilibriumIndices(arr);
        if (i>0) {
            System.out.println("Equilibrium index found at: " + i);
        } else {
            System.out.println("Equilibrium index not found");
        }
    }
}
