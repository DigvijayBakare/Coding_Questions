package classClass;

// Java program to demonstrate asSubclass() method

class A3 {
    // methods and fields
}

class B2 extends A3 {
    // methods and fields
}

public class AsSubclassMethod {
    public static void main(String[] args) {
        A3 a = new A3();

        // returns the Class object for super class(A)
        Class superClass = a.getClass();

        B2 b = new B2();

        // returns the Class object for subclass(B)
        Class subClass = b.getClass();

        // asSubclass method it represent a subclass of the specified  class object
        Class cast = subClass.asSubclass(superClass);

        System.out.println(cast);
    }
}
