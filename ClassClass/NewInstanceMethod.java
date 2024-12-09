package classClass;

// Java program to demonstrate newInstance() method

public class NewInstanceMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // returns the Class object for this class
        Class myClass = Class.forName("classClass.NewInstanceMethod");

        // creating new instance of this class newInstance method
        Object obj = myClass.newInstance();

        // returns the runtime class of obj
        System.out.println("Class of obj : " + obj.getClass());
    }
}
