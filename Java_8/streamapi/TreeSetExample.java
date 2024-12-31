package practice.java8.streamapi;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // declare a tree set for checking null insertion
        Set set = new TreeSet();
//        set.add(4);
//        set.add(null);
        set.add(45);
        set.add("45");
        System.out.println("The set: " + set);

        ///  It is throwing NullPointerException even for the first null element
        // It is compiling, but at runtime it is giving me NPE.
    }
}
