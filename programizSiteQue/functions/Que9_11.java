package practice.programizSiteQue.functions;

public class Que9_11 {
    public static void main(String[] args) {
//        que9();     // Java Program to calculate the power using recursion
//        que10();    // Java Program to Call One Constructor from another
        que11();    // Java Program to implement private constructors
    }

    private static void que9() {
        /// Java Program to calculate the power using recursion
        double base = 3.0;
        int exponent = 2;

        double result = calculatePower(base,exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    private static void que10() {
        /// Java Program to Call One Constructor from another
        Que9_11 o = new Que9_11();
        o.display();
    }

    private static void que11() {
        /// Java Program to implement private constructors
        Que9_11.instanceMethod();
    }

    // Method to calculate power
    private static double calculatePower(double num, int power) {
        // Base case: any number to the power of 0 is 1 and for 1 any power is 1
        if (num == 1 || power == 0) {
            return 1;
        }

        // Handling negative exponent
        if (power < 0) {
            return 1 / calculatePower(num, -power);
        }

        // Recursive case: base^exponent = base * base^(exponent - 1)
        return num * calculatePower(num, power - 1);
    }

    int sum;

    // first constructor
//    Que9_11() {
//        // calling the second constructor
//        this(5, 2);
//    }

    // second constructor
    Que9_11(int arg1, int arg2) {
        // add two value
        this.sum = arg1 + arg2;
    }

    void display() {
        System.out.println("Sum is: " + sum);
    }

    // create private constructor
    private Que9_11 () {
        System.out.println("This is a private constructor.");
    }

    // create a public static method
    public static void instanceMethod() {

        // create an instance of Test class
        Que9_11 obj = new Que9_11();
    }
}