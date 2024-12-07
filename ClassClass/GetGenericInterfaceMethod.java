package classClass;

import java.lang.reflect.Type;

// Java program to demonstrate getGenericInterfaces() method

public class GetGenericInterfaceMethod {
    public static void main(String[] args) throws ClassNotFoundException {
        // returns the Class object for the class with the specified name
        Class c1 = Class.forName("java.util.Set");

        // getGenericInterfaces() on c1 it returns the interfaces implemented by Set interface
        Type c1GenericInterfaces[] = c1.getGenericInterfaces();

        System.out.println("interfaces implemented by Set interface : ");

        // iterating through Set class interfaces
        for (Type type : c1GenericInterfaces) {
            System.out.println(type);
        }
    }
}
