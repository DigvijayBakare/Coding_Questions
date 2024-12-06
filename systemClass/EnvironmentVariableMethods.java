package systemClass;

import java.util.Map;
import java.util.Set;

public class EnvironmentVariableMethods {
    public static void main(String args[]) {
        // getting an environment variable in the map
        Map<String, String> obj = System.getenv();

        // iterating the map
        Set<String> keySet = obj.keySet();
        System.out.println("From map: ");
        for (String key : keySet) {
            System.out.println("key= " + key);
        }

        // checking specific environment variable
        System.out.println("Checking specific environment variable: " + System.getenv("PATH"));
    }
}
