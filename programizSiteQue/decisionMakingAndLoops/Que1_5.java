package practice.programizSiteQue.decisionMakingAndLoops;

public class Que1_5 {
    public static void main(String[] args) {
//        que1();     // Java Program to Check Leap Year
//        que2();     // Java Program to Check Whether a Number is Positive or Negative
//        que3();     // Java Program to Check Whether a Character is Alphabet or Not
//        que4();     // Java Program to Calculate the Sum of Natural Numbers
        que5();     // Java Program to Find Factorial of a Number
    }

    private static void que1() {
        /// Java Program to Check Leap Year
        int year = 2024;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) System.out.println("Leap Year!");
        else System.out.println("Not a Leap Year!");
    }

    private static void que2() {
        /// Java Program to Check Whether a Number is Positive or Negative
        int number = -12;
        if (number > 0) System.out.println(number + " is a positive number!");
        else System.out.println(number + " is a negative number!");
    }

    private static void que3() {
        /// Java Program to Check Whether a Character is Alphabet or Not
        char ch = 'M';
//        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) System.out.println(ch + " is an alphabet");
        if (Character.isAlphabetic(ch)) System.out.println(ch + " is an alphabet");
        else System.out.println(ch + " is not a alphabet");
    }

    private static void que4() {
        /// Java Program to Calculate the Sum of Natural Numbers
        int num = 100, sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum of the first " + num + " numbers is " + sum);
    }

    private static void que5() {
        /// Java Program to Find Factorial of a Number
        int num = 5, fact = 1;
        for (int i = num; i >= 1; i--) {
            fact *= i;
        }
        System.out.println("Factorial of number " + num + " is " + fact);
    }
}