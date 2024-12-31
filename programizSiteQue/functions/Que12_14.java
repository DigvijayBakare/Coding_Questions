package practice.programizSiteQue.functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Que12_14 {
    public static void main(String[] args) {
//        que12();    // Java Program to pass lambda expression as a method argument
//        que13();    // Java Program to Pass the Result of One Method Call to Another Method
        que14();    // Java Program to Calculate the Execution Time of Methods
    }

    private static void que12() {
        /// Java Program to pass lambda expression as a method argument
        // create an ArrayList
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("java", "python"));
        System.out.println("ArrayList: " + languages);

        // pass lambda expression as parameter to replaceAll() method
        languages.replaceAll(e -> e.toUpperCase());
        System.out.println("Updated ArrayList: " + languages);

        // call the forEach() method pass lambda as argument for forEach() reverse each element of ArrayList
        System.out.print("Reversed ArrayList: ");
        languages.forEach((e) -> {
            // body of lambda expression
            String result = "";
            for (int i = e.length() - 1; i >= 0; i--)
                result += e.charAt(i);
            System.out.print(result + ", ");
        });
    }

    private static void que13() {
        /// Java Program to Pass the Result of One Method Call to Another Method
        Que12_14 obj = new Que12_14();

        // call the square() method passing add() as an argument
        obj.square(obj.add(15, 9));
    }

    private static void que14() {
        /// Java Program to Calculate the Execution Time of Methods
        // create a object of the class
        Que12_14 q = new Que12_14();

        // get the start time
        long start = System.nanoTime();

        // call display method
        q.display();

        // get end time
        long end = System.nanoTime();

        // execution time
        long execution = end - start;
        System.out.println("Execution time: " + execution + " ns");
    }

    // calculate the sum
    public int add(int a, int b) {

        // calculate sum
        int sum = a + b;
        return sum;
    }

    // calculate the square
    public void square(int num) {
        int result = num * num;
        System.out.println(result);    // prints 576
    }

    // display method
    public void display() {
        System.out.println("Calculating method executing time: ");
    }
}
