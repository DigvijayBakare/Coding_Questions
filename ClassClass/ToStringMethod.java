package classClass;

// Java program to demonstrate toString() method

public class ToStringMethod {
    public static void main(String[] args) throws ClassNotFoundException {
        // returns the Class object for the class with the specified name
        Class c1 = Class.forName("java.lang.String");
        Class c2 = int.class;
        Class c3 = void.class;

        System.out.print(" Class represented by c1:");

        // toString method on c1
        System.out.println(c1.toString());

        System.out.print(" Class represented by c2:");

        // toString method on c2
        System.out.println(c2.toString());

        System.out.print(" Class represented by c3:");

        // toString method on c3
        System.out.println(c3.toString());
    }
}
