package classClass;

// Java program to demonstrate isInstance() method

public class IsInstanceMethod {
    public static void main(String[] args) throws ClassNotFoundException {
        // returns the Class object for the class with the specified name
        Class c = Class.forName("java.lang.String");

        String s = "GeeksForGeeks";
        int i = 10;

        // checking for Class instance isInstance method
        boolean b1 = c.isInstance(s);
        boolean b2 = c.isInstance(i);

        System.out.println("is s instance of String : " + b1);
        System.out.println("is i instance of String : " + b2);
    }
}
