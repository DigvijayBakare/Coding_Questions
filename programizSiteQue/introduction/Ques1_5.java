package programizSiteQue.introduction;

import java.util.Scanner;

public class Ques1_5 {
    public static void main(String[] args) {
//        que1();       // Java Program to Print an Integer (Entered by the User)
//        que2();       // Java Program to Add Two Integers
//        que3();       // Java Program to Multiply two Floating Point Numbers
//        que4();       // Java Program to Find ASCII Value of a character
        que5();       //  Java Program to Compute Quotient and Remainder
    }

    private static void que1() {
        /// Java Program to Print an Integer (Entered by the User)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.println("Entered number: " + a);
        sc.close();
    }

    private static void que2() {
        /// Java Program to Add Two Integers
        int a = 10, b = 15;
        System.out.println("The integers are: \nA = " + a + "\t\tB = " + b);
        System.out.println("The sum of integers: " + (a + b));
    }

    private static void que3() {
        /// Java Program to Multiply two Floating Point Numbers
        float a = 1.5f, b = 2.0f;
        System.out.println("The floating numbers are: \nA = " + a + "\t\tB = " + b);
        System.out.println("The multiplication of integers: " + (a * b));
    }

    private static void que4() {
        /// Java Program to Find ASCII Value of a character
        char character = 'a';
        System.out.println("The given character: " + character);
        int ascii = character;      // we can type cast it also
        System.out.println("The ASCII Value of the " + character + " is " + ascii);
    }

    private static void que5() {
        ///  Java Program to Compute Quotient and Remainder
        int divident = 25, divisor = 4;
        System.out.println("The divident number: " + divident + "\nThe divisor number: " + divisor);

        int quotient = divident / divisor;
        int remainder = divident % divisor;

        System.out.println("The quotient: " + quotient + "\nThe remainder: " + remainder);
    }
}