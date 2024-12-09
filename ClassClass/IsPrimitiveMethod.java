package classClass;

// Java program to demonstrate isPrimitive method

public class IsPrimitiveMethod {
    public static void main(String[] args) {
        // returns the Class object associated with an integer;
        Class c1 = int.class;

        // returns the Class object associated with Test class
        Class c2 = IsPrimitiveMethod.class;

        // checking for primitive type isPrimitive method on c1
        boolean b1 = c1.isPrimitive();

        // isPrimitive method on c2
        boolean b2 = c2.isPrimitive();

        System.out.println("is " + c1.toString() + " primitive : " + b1);
        System.out.println("is " + c2.toString() + " primitive : " + b2);
    }
}
