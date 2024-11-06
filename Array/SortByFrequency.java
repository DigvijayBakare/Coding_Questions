package TCS_NQT.Array;

//Que: Sort the elements of an array by frequency

import java.util.Arrays;

public class SortByFrequency {
    public static void main(String[] args) {
        // declare and print an integer array
        int[] arr = {1, 3, 6, 2, 5, 4, 8, 9, 7, 2, 1, 3, 6, 5, 4, 7, 8, 9, 3, 2, 1, 4, 6, 2, 4, 6, 1};
        System.out.println("Original array: " + Arrays.toString(arr));

        // sorting an array in ascending order of the frequency of the elements
        int l = arr.length;
        boolean[] boo = new boolean[l];
        int[] v = new int[l];
        int[] c = new int[l];
        for (int i = 0; i < l; i++) {
            if (!boo[i]) {
                int count = 1;
                for (int j = i + 1; j < l; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        boo[j] = true;
                    }
                }

                v[i] = arr[i];
                c[i] = count;
            }
        }
//        System.out.println("array v: " + Arrays.toString(v));
//        System.out.println("array c: " + Arrays.toString(c));

        int cl = c.length;
        int vl = v.length;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 0) {
                cl--;
                vl--;
            }
        }
        int[] cArray = Arrays.copyOf(c, cl);
        int[] vArray = Arrays.copyOf(v, vl);
//        System.out.println("array c: " + Arrays.toString(cArray));
//        System.out.println("array v: " + Arrays.toString(vArray));
        for (int i = 0; i < cArray.length; i++) {
            for (int j = i + 1; j < cArray.length; j++) {
                if (cArray[i] > cArray[j]) {
                    int temp1 = cArray[j];
                    cArray[j] = cArray[i];
                    cArray[i] = temp1;

                    int temp2 = vArray[j];
                    vArray[j] = vArray[i];
                    vArray[i] = temp2;
                }
            }
        }
//        System.out.println("array c after sorting: " + Arrays.toString(cArray));
//        System.out.println("array v after sorting: " + Arrays.toString(vArray));

        System.out.println("The array after sorting according to the frequency of the elements:");
        for (int i = 0; i < cArray.length; i++) {
            for (int j = 0; j < cArray[i]; j++) {
                System.out.print(vArray[i] + " ");
            }
        }
        System.out.println();
    }
}
