package practice.java8.javatechonline;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapEx {
    public static void main(String[] args) {
        // 1. How to iterate and modify values in a Map using Java 8?
        Map<String,String> map = new HashMap<String,String>();
        map.put("Effective Java", "Kathy Sierra");
        map.put("Spring in Action", "Craig Walls");
        map.put("Hibernate in Action", "Gavin King");
        map.put("Pro Angular", "Freeman");
        map.put("Pro Spring Boot", "Felipe Gutierrez");

        //Only modify if key already exists in the map
        map.computeIfPresent("Effective Java", (key, value) -> "Joshua Bloch");

        //Only modify if key doesn't exist in the map
        map.computeIfAbsent("Core Java", (value) -> "Kathy Sierra");

        //iterate and print the values
//        map.entrySet().iterator().forEachRemaining(System.out::println);

        // 2. How to print keys & values of a Map using Java 8 ?
        // 1) Using  Collection.iterator() and Iterator.forEachRemaining()
//        map.keySet().iterator().forEachRemaining(System.out::println);
//        map.values().iterator().forEachRemaining(System.out::println);

        // 2) Using Collection.stream() and Stream.forEach()
//        map.keySet().stream().forEach(System.out::println);
//        map.values().stream().forEach(System.out::println);

        // 3) Using Stream.of() and  Collection.toArray() and Stream.forEach()
//        Stream.of(map.keySet().toArray()).forEach(System.out::println);
//        Stream.of(map.values().toArray()).forEach(System.out::println);

        // 4) Using Stream.of() and  Collection.toString() and Stream.forEach()
        Stream.of(map.keySet().toString()).forEach(System.out::println);
        Stream.of(map.values().toString()).forEach(System.out::println);


    }
}
