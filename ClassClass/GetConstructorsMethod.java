package classClass;

// Java program to demonstrate getConstructors() method

import java.lang.reflect.Constructor;

public class GetConstructorsMethod {
    public static void main(String[] args)
            throws SecurityException, ClassNotFoundException {
        // returns the Class object for the class with the specified name
        Class c1 = Class.forName("java.lang.Boolean");

        // getConstructor method on c1 it returns an array of constructors of Boolean class
        Constructor C[] = c1.getConstructors();

        System.out.println("Below are the constructors of Boolean class :");

        // iterating through all constructors
        for (Constructor constructor : C) {
            System.out.println(constructor);
        }
    }
}
