package practice.java8.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Part_1_1To5 {
    public static void main(String[] args) {
//        que1();     // Find the longest string in a list of strings using Java streams
//        que2();     // Calculate the average age of a list of Person objects using Java streams
//        que3();     // Check if a list of integers contains a prime number using Java streams
//        que4();     // Merge two sorted lists into a single sorted list using Java streams
        que5();     // Find the intersection of two lists using Java streams
    }

    private static void que1() {
        /// Find the longest string in a list of strings using Java streams
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
        System.out.println("Original list of Strings: " + strings);

        // get longest string
        String longestString = strings.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println("Longest string in the list: " + longestString);
    }

    private static void que2() {
        /// Calculate the average age from a list of Person objects using Java streams
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );
        double average = persons.stream().mapToInt(Person::getAge).average().orElse(0);
        System.out.println("Average of the age of persons in the list: " + average);
    }

    private static void que3() {
        /// Check if a list of integers contains a prime number using Java streams
        List<Integer> num = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        System.out.println("Original number list: " + num);

        // check if the list contains prime number or not
        boolean anyMatch = num.stream().anyMatch(Part_1_1To5::isPrime);
        System.out.println("Is the list contains any prime number: " + anyMatch);

        List<Integer> primeNumbers = num.stream().filter(Part_1_1To5::isPrime).collect(Collectors.toList());
        System.out.println("List of prime numbers in the list: " + primeNumbers);
    }

    private static void que4() {
        /// Merge two sorted lists into a single sorted list using Java streams
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
        System.out.println("List 1: " + list1 + "\nList 2: " + list2);

        // merge and sort the new list
        List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream()).sorted().collect(Collectors.toList());
        System.out.println("Merged list: " + mergedList);
    }

    private static void que5() {
        /// Find the intersection of two lists using Java streams
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        System.out.println("List 1: " + list1 + "\nList 2: " + list2);

        // intersection of these two list
        List<Integer> intersectionElements = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println("The intersection of the 2 given lists: " + intersectionElements);
    }


    // is prime method
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

