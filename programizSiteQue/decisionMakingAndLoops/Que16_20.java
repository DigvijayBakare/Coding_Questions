package practice.programizSiteQue.decisionMakingAndLoops;

import java.util.Scanner;

public class Que16_20 {
    public static void main(String[] args) {
//        que16();     // Java Program to Display Prime Numbers Between Two Intervals
//        que17();     // Java Program to Check Armstrong Number
//        que18();     // Java Program to Display Armstrong Number Between Two Intervals
//        que19();     // Java Program to Display Factors of a Number
        que20();     // Java Program to Make a Simple Calculator Using switch...case
    }

    private static void que16() {
        /// Java Program to Display Prime Numbers Between Two Intervals
        int low = 10, high = 100;
        System.out.println("The intervals are: \nlow = " + low + "\t\thigh = " + high);

        while (low < high) {
            boolean flag = false;

            for (int i = 2; i <= low / 2; ++i) {
                // condition for non-prime number
                if (low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1) System.out.print(low + " ");
            ++low;
        }
    }

    private static void que17() {
        /// Java Program to Check Armstrong Number
        // if the sum of power of digits of each digit in a number is equal to the num it is armstrong num

        int num = 153, original, remainder, result = 0;
        System.out.println("Original number: " + num);

        // check if the number is armstrong or not
        original = num;
        while (original != 0) {
            remainder = original % 10;
            result += Math.pow(remainder, 3);
            original /= 10;
        }
        if (result == num) System.out.println("The number is armstrong number");
        else System.out.println("The number is armstrong number");
    }

    private static void que18() {
        /// Java Program to Display Armstrong Number Between Two Intervals
        int low = 99, high = 9999;
        System.out.println("The intervals are: \nlow = " + low + "\t\thigh = " + high);

        for (int number = low + 1; number < high; ++number) {
            int digits = 0;
            int result = 0;
            int originalNumber = number;

            // number of digits calculation
            while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
            }

            originalNumber = number;

            // result contains sum of nth power of its digits
            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }

            if (result == number) {
                System.out.print(number + " ");
            }
        }
    }

    private static void que19() {
        /// Java Program to Display Factors of a Number
        int num = 60;
        System.out.println("The number: " + num);

        // finding factorials
        System.out.print("The factors: ");
        for (int i = 1; i <= num; ++i) {
            if (num % i == 0) System.out.print(i + " ");      // i is the factor of number
        }
        System.out.println();
    }

    private static void que20() {
        /// Java Program to Make a Simple Calculator Using switch...case
        char operator;
        Double number1, number2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        switch (operator) {

            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
        input.close();
    }
}
