package classClass;

// Java program to demonstrate getGenericSuperclass() method

public class GetGenericSuperClassMethod {
    public static void main(String[] args) throws ClassNotFoundException {
        // returns the Class object associated with Test class
        Class myClass = GetGenericSuperClassMethod.class;

        // returns the Class object for the class with the specified name
        Class c1 = Class.forName("java.util.ArrayList");
        Class c3 = Class.forName("java.lang.Object");

        // getGenericSuperclass method returns the generic superclass of the class represented by this class object
        System.out.print("Test superclass : ");

        // getGenericSuperclass method on myClass
        System.out.println(myClass.getGenericSuperclass());

        System.out.print("ArrayList superclass : ");

        // getGenericSuperclass method on c1
        System.out.println(c1.getGenericSuperclass());

        System.out.print("Object superclass : ");

        // getGenericSuperclass method on c3
        System.out.println(c3.getGenericSuperclass());
    }
}
