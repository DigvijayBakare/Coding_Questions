package systemClass;

import java.util.Arrays;

public class ArrayCopyMethod {
    public static void main(String[] args) {
        // declare and print 2 integer arrays
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};
        System.out.println("A: " + Arrays.toString(a));
        System.out.println("B: " + Arrays.toString(b));

//        System.arraycopy(a, 0, b, 2, 2);
        System.arraycopy(b, 2, a, 2, 2);

        // array b after arraycopy operation
//        System.out.println("New Copied array: "+Arrays.toString(b));
        System.out.println("New Copied array: "+Arrays.toString(a));
    }
}
