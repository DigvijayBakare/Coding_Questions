package systemClass;

public class ExitMethod {
    public static void main(String args[]) throws NullPointerException {
        // calling garbage collector
        System.gc();
        System.out.println("Garbage collector executed ");

        // getting the property of os.name
        System.out.println(System.getProperty("os.name"));

        // exiting the java code
        System.exit(1);

        // this line will not execute as JVM terminated
        System.out.println("JVM terminated");
    }
}
