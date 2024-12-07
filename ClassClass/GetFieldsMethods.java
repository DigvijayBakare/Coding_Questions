package classClass;

// Java program to demonstrate getFields() method

import java.lang.reflect.Field;

public class GetFieldsMethods {
    public static void main(String[] args) throws SecurityException, ClassNotFoundException, NoSuchFieldException {
        // returns the Class object for the class with the specified name
        Class c1 = Class.forName("java.lang.Integer");

        // getFields method on c1 it array of fields of Integer class
        Field F[] = c1.getFields();

        System.out.println("Below are the fields of Integer class : ");

        // iterating through all fields of  String class
        for (Field field : F) {
            System.out.println(field);
        }

        // getField method on c1 it checks a public field in Integer class with specified parameter
        Field f = c1.getField("MIN_VALUE");

        System.out.println("public field in Integer class with MIN_VALUE name :");
        System.out.println(f);
    }
}
