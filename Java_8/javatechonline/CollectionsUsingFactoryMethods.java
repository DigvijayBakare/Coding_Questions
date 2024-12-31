package practice.java8.javatechonline;

// How to create various collections using Factory Method of Java 9 ?

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsUsingFactoryMethods {
    public static void main(String[] args) {
        ///  creates unmodifiable collections with no generic type specified
        List<String> list = List.of("USA", "Canada", "Russia");

        Set<String> set = Set.of("USA", "Canada", "Russia");

        Map<String, String> map = Map.of("USA", "Washington, D.C.", "Canada", "Ottawa", "Russia", "Moscow");

        /// specify a generic type of the Collection returned by of()
        List<String> list1 = List.<String>of("USA", "Canada", "Russia");
        Set<String> set1 = Set.<String>of("USA", "Canada", "Russia");
        Map<String, String> map1 = Map.<String, String>of("USA", "Washington, D.C.", "Canada", "Ottawa", "Russia", "Moscow");
    }
}
