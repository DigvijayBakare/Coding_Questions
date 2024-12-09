package classClass;

// Java program to demonstrate getName() method

public class GetNameMethod {
    public static void main(String[] args) throws ClassNotFoundException {
        // returns the Class object associated with Test class
        Class c = GetNameMethod.class;

        System.out.print("Class Name associated with c : ");

        // returns the name of the class getName method
        System.out.println(c.getName());

        simpleName();
    }

    // Java program to demonstrate getSimpleName() method
    public static void simpleName() throws ClassNotFoundException {
        // returns the Class object for the class with the specified name
        Class c1 = Class.forName("java.lang.String");

        System.out.print("Class Name associated with c : ");

        // returns the name of the class getName method
        System.out.println(c1.getName());

        System.out.print("Simple class Name associated with c : ");

        // returns the simple name of the class getSimpleName method
        System.out.println(c1.getSimpleName());
    }
}
