package systemClass;

public class TImeMethods {
    public static void main(String args[]) throws NullPointerException {
        // difference between the current time and midnight, January 1, 1970 UTC
        System.out.println("difference between the "
                + "current time and midnight,"
                + " January 1, 1970 UTC is: " +
                System.currentTimeMillis());

        // current time in nanoseconds
        System.out.println("current time in "
                + "nano sec: " +
                System.nanoTime());
    }
}
