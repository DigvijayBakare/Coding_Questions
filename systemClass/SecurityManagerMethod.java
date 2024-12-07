package systemClass;

public class SecurityManagerMethod {
    public static void main(String args[]) {
        // creating object of security manager
        SecurityManager obj = new SecurityManager();

        // setting the security manager
        System.setSecurityManager(obj);

        // getting the security manager
        obj = System.getSecurityManager();
        if (obj != null)
            System.out.println("Security manager is configured");
    }
}
