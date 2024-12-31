package practice.programizSiteQue.decisionMakingAndLoops;

public class Que6_10 {
    public static void main(String[] args) {
//        que6();     // Java Program to Generate Multiplication Table
//        que7();     // Java Program to Display Fibonacci Series
//        que8();     // Java Program to Find GCD of two Numbers
//        que9();     // Java Program to Find LCM of two Numbers
        que10();     // Java Program to Display Alphabets (A to Z) using loop
    }

    private static void que6() {
        /// Java Program to Generate Multiplication Table
        int num = 5, product = 1;
        for (int i = 1; i <= 10; i++) {
            product = num * i;
            System.out.print(product + " ");
        }
    }

    private static void que7() {
        /// Java Program to Display Fibonacci Series
        int n = 5;
        int n1 = 0, n2 = 1, nth, count = 0;
        if (n == 0) {
            System.out.println("Please enter positive number!");
        } else if (n == 1) {
            System.out.println("Fibonacci series: " + n + ":");
        } else {
            System.out.println("Fibonacci series: ");
            while (count < n) {
                System.out.print(n1 + " ");
                nth = n1 + n2;
                n1 = n2;
                n2 = nth;
                count++;
            }
        }
    }

    private static void que8() {
        /// Java Program to Find GCD of two Numbers
        /* The HCF or GCD of two integers is the largest integer that can exactly divide both numbers (without a remainder). */
        int n1 = 81, n2 = 153;
        System.out.println("The given numbers are: \nn1 = " + n1 + "\t\tn2 = " + n2);

        // setting initial GCD to 1
        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; ++i) {
            // check if i perfectly divides both n1 and n2
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD of " + n1 + " and " + n2 + " is " + gcd);
    }

    private static void que9() {
        /// Java Program to Find LCM of two Numbers
        /* The LCM of two integers is the smallest positive integer that is perfectly divisible by both the numbers (without a remainder).*/
        int n1 = 72, n2 = 120;

        int gcd = findGCD(n1, n2);
        int lcm = (n1 * n2) / gcd;

        // print LCM
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
    }

    // finding GCD for LCM
    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }

    private static void que10() {
        /// Java Program to Display Alphabets (A to Z) using loop
        for (char c = 'A'; c <='Z'; c++) System.out.print(c + " ");
        System.out.println();
    }
}