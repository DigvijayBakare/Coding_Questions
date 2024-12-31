package practice.programizSiteQue.decisionMakingAndLoops;

public class Que11_15 {
    public static void main(String[] args) {
//        que11();     // Java Program to Count Number of Digits in an Integer
//        que12();     // Java Program to Reverse a Number
//        que13();     // Java Program to Calculate the Power of a Number
//        que14();     // Java Program to Check Palindrome
        que15();     // Java Program to Check Whether a Number is Prime or Not
    }

    private static void que11() {
        /// Java Program to Count Number of Digits in an Integer
        int num = 00025345;
        System.out.println("Original Number: " + num);

        int count = 0;
        while (num != 0) {
            num /= 10;
            ++count;
        }
        System.out.println("Number of digits in the given number: " + count);
    }

    private static void que12() {
        /// Java Program to Reverse a Number
        int num = 514532156;
        System.out.println("Original number: " + num);

        // reverse the number
        String str = new String(String.valueOf(num));

        // using string builder
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder reverse = stringBuilder.reverse();
        num = Integer.parseInt(new String(reverse));
        System.out.println("New number: " + num);

        // using for loop
        System.out.print("New number: ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    private static void que13() {
        /// Java Program to Calculate the Power of a Number
        int num = 8;
        System.out.println("Original number: " + num);

        // using * oprator
        int operator = num * num;
        System.out.println("Power of number " + num + " is " + operator);

        // using Math
        int method = (int) Math.pow(num, 2);
        System.out.println("Power of number " + num + " is " + method);
    }

    private static void que14() {
        /// Java Program to Check Palindrome
        // string is said to be palindrome if the reverse of the string is equal to the original string
//        String original = "nil";
        String original = "level";
        System.out.println("Original string: " + original);

        // check for the palindrome string
        StringBuilder sb = new StringBuilder(original);
        String reversed = new String(sb.reverse());
        System.out.println("Reversed string: " + reversed);
        if (original.equals(reversed)) System.out.println("The given string is palindrome");
        else System.out.println("The given string is not palindrome");
    }

    private static void que15() {
        /// Java Program to Check Whether a Number is Prime or Not
        int num = 12;
        boolean flag = false;

        // 0 and 1 are not prime numbers
        if (num == 0 || num == 1) {
            flag = true;
        }
        for (int i = 2; i <= num / 2; i++) {
            // condition for non-prime numbers
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) System.out.println(num + " is a prime number.");
        else System.out.println(num + " is not a prime number.");
    }
}

/*





Java Program to Display Prime Numbers Between Two Intervals
Java Program to Check Armstrong Number
Java Program to Display Armstrong Number Between Two Intervals
Java Program to Display Factors of a Number
Java Program to Make a Simple Calculator Using switch...case
Java Program to Count the Number of Vowels and Consonants in a Sentence
Java Program to Sort Elements in Lexicographical Order (Dictionary Order)
Java Code To Create Pyramid and Pattern
 */