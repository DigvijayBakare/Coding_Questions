package systemClass;

import static java.lang.System.clearProperty;
import static java.lang.System.setProperty;

public class PropertyRelatedMethods {
    public static void main(String[] args) {
        // checking specific property
        System.out.println(System.getProperty("user.home"));

        // clearing this property
        clearProperty("user.home");

        // after clearing the property
        System.out.println(System.getProperty("user.home"));

        // setting specific property
        setProperty("user.country", "US");

        // checking property
        System.out.println(System.getProperty("user.country"));

        // checking property other than system property
        // illustrating getProperty(String key, String def)
        System.out.println(System.getProperty("user.password",
                "none of your business"));
    }
}
