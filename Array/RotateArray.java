package TCS_NQT.Array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Do you want to continue");

            if (sc.hasNextLine()){
                String str = sc.nextLine();
                if (str.equalsIgnoreCase("exit")){
                    System.out.println("OK, I'm leaving.....");
                    break;
                }else {
                    try {
                        int pos = Integer.parseInt(str);
                        rotateAndPrint(array,pos);
                    }catch (NumberFormatException n){
                        System.out.println("Invalid input. Please enter another number");
                    }
                }
            }else {
                System.out.println("No");
            }//        sc.close();                        // at second iteration IllegalStateException occurs
        }
//        sc.close();
    }

    public static void rotateAndPrint(int[] array, int startPos) {
        int n = array.length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting rotation with: " + startPos);

        for (int i = 0; i < n; i++) {
            rotateLeftByOne(array);
            if (array[0] == startPos) {
                System.out.println(Arrays.toString(array));
            }
        }
    }

    public static void rotateLeftByOne(int[] array) {
        int n = array.length;
        int first = array[0];
        for (int i = 0; i < n - 1; i++) {
            array[i] = array[i + 1];
        }
        array[n - 1] = first;
    }
}