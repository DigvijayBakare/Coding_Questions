package TCS_NQT.Array;

import java.util.Arrays;
import java.util.Scanner;

// Que: Add an element in the array

public class AddElement {
    // Method to add an element to an array
    public static int[] addElement(int[] originalArray, int newElement) {
        // Create a new array with one additional size
        int[] newArray = new int[originalArray.length + 1];

        // Copy original elements to the new array
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        // Add the new element at the end
        newArray[originalArray.length] = newElement;

        return newArray;
    }

    public static void main(String[] args) {
        // declare and print an integer array
        int[] arr = {0, 1, 2, 45, 7, 5, 17};
        System.out.println("Original Array: " + Arrays.toString(arr));

        // repeating the loop for multiple inputs from user
        boolean flag = true;
        while (flag) {
            // Element to be added
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an element to add in the array: ");
            int x = sc.nextInt();

            // Call the addElement method to add x in arr
            arr = addElement(arr, x);

            System.out.println("Array after adding " + x + ": " + Arrays.toString(arr));
            System.out.println("Do you want to add another: " +
                    "\nIf Yes: Press y" +
                    "\nIf No: Press n");
            String in = sc.next();
            flag = !in.equals("n");
        }
    }
}
