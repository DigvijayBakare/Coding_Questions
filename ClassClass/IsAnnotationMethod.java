package classClass;

// Java program to demonstrate isAnnotation() method

@interface A
{
    // Annotation element definitions
}

public class IsAnnotationMethod {
    public static void main(String[] args) throws ClassNotFoundException {
        // returns the Class object associated with A  annotation
        Class c1 = A.class;

        // returns the Class object associated with Test class
        Class c2 = IsAnnotationMethod.class;

        // checking for annotation type isAnnotation method
        boolean b1 = c1.isAnnotation();
        boolean b2 = c2.isAnnotation();

        System.out.println("is " + c1.toString() + " an annotation  : " + b1);
        System.out.println("is " + c2.toString() + " an annotation : " + b2);
    }
}
