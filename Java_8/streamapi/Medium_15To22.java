package practice.java8.streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Medium_15To22 {
    public static void main(String[] args) {
//        que15();    // Write a Java 8 program to sort an array and then convert the sorted array into Stream?
//        que16();    // How to use map to convert object into Uppercase in Java 8?
//        que17();    // How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
//        que18();    // How to count each element/word from the String ArrayList in Java8?
//        que19();    // How to find only duplicate elements with its count from the String ArrayList in Java8?
//        que20();    // How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
//        que21();    // Write a Program to find the Maximum element in an array?
        que22();    // Write a program to print the count of each character in a String?
    }

    private static void que15() {
        /// Write a Java 8 program to sort an array and then convert the sorted array into Stream?
        int[] arr = {8, 2, 6, 1, 3, 9, 4, 7, 5, 10};
        System.out.println("Original array: " + Arrays.toString(arr));

        Arrays.sort(arr);

        // converting to the stream and then printing each element in the stream
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void que16() {
        /// How to use map to convert object into Uppercase in Java 8?
        List<String> list = List.of("aa", "bb", "cc", "dd");
        System.out.println("Original list: " + list);

        List<String> upperCase = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("New list: " + upperCase);
    }

    private static void que17() {
        /// How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
        List<Notes> notesList = new ArrayList<>();
        notesList.add(new Notes(1, "note1", 11));
        notesList.add(new Notes(2, "note2", 22));
        notesList.add(new Notes(3, "note3", 33));
        notesList.add(new Notes(4, "note4", 44));
        notesList.add(new Notes(5, "note5", 55));
        notesList.add(new Notes(6, "note4", 66));

        System.out.println("Original list: " + notesList);

        LinkedHashMap<String, Integer> notesRecord = notesList.stream().sorted(Comparator.comparingLong(Notes::getId).reversed())
                .collect(Collectors.toMap(Notes::getName, Notes::getId,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        // consider old value 44 for duplicate key it keeps the order
        System.out.println("Notes: " + notesRecord);
    }

    private static void que18() {
        /// How to count each element/word from the String ArrayList in Java8?
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        System.out.println("Original list: " + names);

        Map<String, Long> namesCount = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Count of each element: " + namesCount);
    }

    private static void que19() {
        /// How to find only duplicate elements with its count from the String ArrayList in Java8?
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        System.out.println("Original list: " + names);

        Map<String, Long> namesCount = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Duplicate elements: " + namesCount);
    }

    private static void que20() {
        /// How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
        List<Integer> list = List.of(1, 5, 2, 3, 6, 4, 7, 9, 8, 0, 10);
//        List<Integer> list = List.of();
        System.out.println("Original list: " + list);
        Optional.ofNullable(list)
                .orElseGet(Collections::emptyList) // creates empty immutable list: [] in case list is null
                .stream().filter(Objects::nonNull) //loop through each object and consider non-null objects
                .forEach(System.out::println); // it will print each element
    }

    private static void que21() {
        /// Write a Program to find the Maximum element in an array?
        int[] arr = {1, 5, 2, 3, 6, 4, 8, 9, 7, 10};
        System.out.println("Original array: " + Arrays.toString(arr));

        // finding max element
        int max = Arrays.stream(arr).max().orElse(0);
        System.out.println("Maximum element in an array: " + max);
    }

    private static void que22() {
        /// Write a program to print the count of each character in a String?
        String string = "Java Java Java";
        System.out.println("Original string: " + string);

        // counting frequency of each character in the string
        Map<Character, Long> frequency = string.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Frequency of each character: " + frequency);

        //
        Map<String, Long> mapObject = Arrays.stream(string.split(""))
                .map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Frequency of each character: " + mapObject);
    }
}


class Notes {
    int id;
    String name;
    int val;

    public Notes(int id, String name, int val) {
        this.id = id;
        this.name = name;
        this.val = val;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Notes {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", val=" + val +
                '}';
    }
}