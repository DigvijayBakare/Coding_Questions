package classClass;

// Java program to demonstrate getInterfaces() method

public class GetInterfaceMethod {
    public static void main(String[] args) throws ClassNotFoundException {
        // returns the Class object for the class with the specified name
        Class c1 = Class.forName("classClass.B1");
        Class c2 = Class.forName("java.lang.String");

        // getInterface method on c1 it returns the interfaces implemented by B class
        Class c1Interfaces[] = c1.getInterfaces();

        // getInterface method on c2 returns the interfaces implemented by String class
        Class c2Interfaces[] = c2.getInterfaces();

        System.out.println("interfaces implemented by B class : ");

        // iterating through B class interfaces
        for (Class class1 : c1Interfaces) {
            System.out.println(class1);
        }

        System.out.println("interfaces implemented by String class : ");

        // iterating through String class interfaces
        for (Class class1 : c2Interfaces) {
            System.out.println(class1);
        }
    }
}

interface A2 {
    // methods and constant declarations
}

// derived class
class B1 implements A2 {
    // methods implementations that were declared in A
}