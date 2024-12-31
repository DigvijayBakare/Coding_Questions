package practice.programizSiteQue.functions;

public class Que1_4 {
    public static void main(String[] args) {
//        que1();     // Java Program to Check Whether a Number can be Expressed as Sum of Two Prime Numbers
//        que2();     // Java Program to Find the Sum of Natural Numbers using Recursion
//        que3();     // Java Program to Find Factorial of a Number Using Recursion
        que4();     // Java Program to Find G.C.D Using Recursion
    }

    private static void que1() {
        /// Java Program to Check Whether a Number can be Expressed as Sum of Two Prime Numbers
        int num = 82;
        System.out.println("The number: " + num);

        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition to check for the prime number
            if (checkPrime(i)) {
                // condition for the number -i to be a prime number
                if (checkPrime(num - i)) {
                    // add the results of 2 prime numbers
                    System.out.printf("%d = %d + %d\n", num, i, num - i);
                    flag = true;
                }
            }
        }
        if (!flag) System.out.println(num + " cannot be expressed as the sum of two prime numbers.");
    }

    private static void que2() {
        /// Java Program to Find the Sum of Natural Numbers using Recursion
        int n = 20;
        System.out.println("Finding the sum of first " + n + " natural numbers");

        int sum = addNumber(n);
        System.out.println("Sum of first " + n + " natural numbers is " + sum);
    }

    private static void que3() {
        /// Java Program to Find Factorial of a Number Using Recursion
        int n = 5;
        int fact = findFactorial(n);
        System.out.println("Factorial of " + n + " is " + fact);
    }

    private static void que4() {
        /// Java Program to Find G.C.D Using Recursion
        int n1 = 366, n2=60;
        int hcf = findHcf(n1,n2);
        System.out.printf("G.C.D. of %d and %d is %d", n1,n2,hcf);
    }

    // Function to check prime number
    private static boolean checkPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    // Function to calculate sum
    private static int addNumber(int num) {
        if (num != 0) return num + addNumber(num - 1);
        else return num;
    }

    // Function to find factorial of the given number
    private static int findFactorial(int num) {
        if (num == 0) {
            System.out.println("Please enter number greater than zero!!");
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return num * findFactorial(num-1);
        }
    }

    //
    private static int findHcf(int n1, int n2) {
        if (n2 != 0) return findHcf(n2, n1%n2);
        else return n1;
    }
}
