package classClass;

// Java program to demonstrate getPackage() method

public class GetPackageMethod {
    public static void main(String[] args) throws ClassNotFoundException {
        // returns the Class object for the class with the specified name
        Class c1 = Class.forName("java.lang.String");
        Class c2 = Class.forName("java.util.ArrayList");

        // getting package of class c1
        System.out.println(c1.getPackage());

        // getPackage method on c2
        System.out.println(c2.getPackage());

    }
}
