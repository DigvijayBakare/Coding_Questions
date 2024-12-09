package classClass;

// Java program to demonstrate isAssignableFrom() method

public class IsAssignableFromMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // returns the Class object for this class
        Class myClass = Class.forName("classClass.IsAssignableFromMethod");

        // returns the Class object for the class with the specified name
        Class c1 = Class.forName("java.lang.Thread");
        Class c2 = Class.forName("java.lang.String");

        // isAssignableFrom method on c1 it checks whether Thread class is assignable from Test
        boolean b1 = c1.isAssignableFrom(myClass);

        // isAssignableFrom method on c2 it checks whether String class is assignable from Test
        boolean b2 = c2.isAssignableFrom(myClass);

        System.out.println("is Thread class Assignable from Test : " + b1);
        System.out.println("is String class Assignable from Test : " + b2);

    }
}
