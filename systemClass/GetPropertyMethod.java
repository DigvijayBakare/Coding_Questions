package systemClass;

import java.util.Properties;
import java.util.Set;

public class GetPropertyMethod {
    public static void main(String args[]) {
        // getting system properties in properties class
        Properties obj = System.getProperties();

        // iterating using key set
        Set<Object> keySet = obj.keySet();
        for (Object key : keySet) {
            System.out.println("key= " + key);
        }
    }
}
