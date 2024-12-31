package practice.java8.javatechonline;

// How to iterate a Map containing a List of String in Java 8 ?

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IteratingMap {
    public static void main(String[] args) {
        // Create HashMap of category and list of animals under the category
        Map<String, List<String>> listOfAnimals = new HashMap<String, List<String>>();

        // List #1: Creating list of Animals in Mammals Category
        List<String> listOfMammals = Arrays.asList("Cat", "Dog", "Monkey", "Cow");
        //Adding listOfMammals into Mammal's Category
        listOfAnimals.put("Mammals", listOfMammals);

        // List #2: Creating list of Animals in Birds Category
        List<String> listOfBirds = Arrays.asList("Crow", "Parrot", "Peacock", "Flamingo");
        //Adding listOfMammals into Bird's Category
        listOfAnimals.put("Birds", listOfBirds);

        // List #3: Creating list of Animals in Reptiles Category
        List<String> listOfReptiles = Arrays.asList("Lizard", "Turtle", "Crocodile", "Python");
        //Adding listOfMammals into Reptile's Category
        listOfAnimals.put("Reptiles", listOfReptiles);

        // Iterating Map using forEach() in Java 8
        listOfAnimals.forEach(
                (key, value)->System.out.println(
                        "Category name : " + key + "\t\t"
                                + "List of Animals under the Category : " + value));
    }
}
