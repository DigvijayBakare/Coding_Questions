package classClass;

// Java program to demonstrate getMethods() method

import java.lang.reflect.Method;

public class GetMethodsMethod {
    public static void main(String[] args) throws SecurityException, ClassNotFoundException {
        // returns the Class object for the class with the specified name
        Class c1 = Class.forName("java.lang.Object");

        // getMethods method on c1 it returns array of methods of Object class
        Method M[] = c1.getMethods();

        System.out.println("Below are the methods of Object class : ");

        // iterating through all methods of Object class
        for (Method method : M) {
            System.out.println(method);
        }
    }
}
