package classClass;

// Java program to demonstrate getSuperclass() method

public class GetSuperClassMethod {
    public static void main(String[] args) throws ClassNotFoundException {
        // returns the Class object associated with Test class
        Class myClass = GetSuperClassMethod.class;

        // returns the Class object for the class with the specified name
        Class c1 = Class.forName("classClass.A1");
        Class c2 = Class.forName("classClass.B");
        Class c3 = Class.forName("java.lang.Object");

        // getSuperclass method returns the superclass of the class represented by this class object
        System.out.print("Test superclass : ");

        // getSuperclass method on myClass
        System.out.println(myClass.getSuperclass());

        System.out.print("A superclass : ");

        // getSuperclass method on c1
        System.out.println(c1.getSuperclass());

        System.out.print("B superclass : ");

        // getSuperclass method on c2
        System.out.println(c2.getSuperclass());

        System.out.print("Object superclass : ");

        // getSuperclass method on c3
        System.out.println(c3.getSuperclass());
    }
}

// base class
class A1 {
    // methods and fields
}

// derived class
class B extends A1 {

}