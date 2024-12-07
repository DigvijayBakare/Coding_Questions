package classClass;

// Java program to demonstrate forName() method

public class ForNameMethod {
    public static void main(String[] args) throws ClassNotFoundException {
        // forName method it returns the Class object for the class with the specified name
        Class c = Class.forName("java.lang.String");

        System.out.println("Class represented by c : " + c.toString());

        // returns the Class object for this class
        Class myClass = Class.forName("classClass.ForNameMethod");

        ClassLoader loader = myClass.getClassLoader();

        // forName method it returns the Class object for the class with the specified name using the given class loader
        Class c1 = Class.forName("java.lang.String",true,loader);

        System.out.println("Class represented by c : " + c1.toString());
    }
}
