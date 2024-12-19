package programizSiteQue.introduction;

public class Ques6_10 {
    public static void main(String[] args) {
//        que6();     // Java Program to Swap Two Numbers
//        que7();     // Java Program to Check Whether a Number is Even or Odd
//        que8();     // Java Program to Check Whether an Alphabet is Vowel or Consonant
//        que9();     // Java Program to Find the Largest Among Three Numbers
        que10();     // Java Program to Find all Roots of a Quadratic Equation
    }

    private static void que6() {
        /// Java Program to Swap Two Numbers
        int a = 10, b = 5;
        // using third variable here
        System.out.println("The values to swap: \nA: " + a + "\nB: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping numbers: \nA:" + a + "\nB: " + b);
    }

    private static void que7() {
        /// Java Program to Check Whether a Number is Even or Odd
        int a = 10;
        System.out.println("The given number: " + a);
        if (a % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

    private static void que8() {
        /// Java Program to Check Whether an Alphabet is Vowel or Consonant
        String vowel = "aeiouAEIOU";
        String a = "s";
        System.out.println("The given alphabet: " + a);
        if (vowel.contains(a)) System.out.println("The alphabet is vowel");
        else System.out.println("The alphabet is consonant");
    }

    private static void que9() {
        /// Java Program to Find the Largest Among Three Numbers
        int a = 10, b = 12, c = 15;
        System.out.println("The numbers: " + "\nA = " + a + "\tB = " + b + "\tC = " + c);

        if (a > b && a > c) {
            System.out.println(a + " is largest");
        } else if (b > c) {
            System.out.println(b + " is largest");
        } else {
            System.out.println(c + " is largest");
        }
    }

    private static void que10() {
        /// Java Program to Find all Roots of a Quadratic Equation
        // value a, b, and c
        double a = 4, b = 5, c = 6;
        double root1, root2;

        // calculate the discriminant (b2 - 4ac)
        double discriminant = b * b - 4 * a * c;

        // check if discriminant is greater than 0
        if (discriminant > 0) {
            // two real and distinct roots
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }

        // check if discriminant is equal to 0
        else if (discriminant == 0) {
            // two real and equal roots
            // discriminant is equal to 0
            // so -b + 0 == -b
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }

        // if discriminant is less than zero
        else {
            // roots are complex number and distinct
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-discriminant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}