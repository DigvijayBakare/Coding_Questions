package practice.programizSiteQue.decisionMakingAndLoops;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Que21_23 {
    public static void main(String[] args) {
//        que21();     // Java Program to Count the Number of Vowels and Consonants in a Sentence
//        que22();     // Java Program to Sort Elements in Lexicographical Order (Dictionary Order)
        que23();     // Java Code To Create Pyramid and Pattern
    }

    private static void que21() {
        /// Java Program to Count the Number of Vowels and Consonants in a Sentence
        String str = "aeiouAEIOU";

        String sentence = "Java is a programming language";
        System.out.println("Original string: " + sentence);

        // find number of vowels and consonants
        int vowel = 0, consonant = 0, characters = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char current = sentence.charAt(i);
            if (Character.isAlphabetic(current)) {
                characters++;
                if (str.contains(String.valueOf(current))) {
                    vowel++;
                } else if (Character.isAlphabetic(current)) consonant++;
            }
        }
        System.out.println("The total number of characters: " + characters
                + "\nTotal number of vowels: " + vowel
                + "\nTotal number of consonants: " + consonant);
    }

    private static void que22() {
        /// Java Program to Sort Elements in Lexicographical Order (Dictionary Order)
        String[] words = {"Ruby", "C", "Python", "Java"};
        System.out.println("Original order of the list: " + Arrays.toString(words));

        for (int i = 0; i < 3; ++i) {
            for (int j = i + 1; j < 4; ++j) {
                if (words[i].compareTo(words[j]) > 0) {
                    // swap words[i] with words[j[
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        System.out.print("In lexicographical order:");
        for (int i = 0; i < 4; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println();

        List<String> list = Arrays.asList(words);
        // using stream
        List<String> stream = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Using stream: " + stream);

        // using collection
        Collections.sort(list);
        System.out.println("Using collection: " + list);
    }

    private static void que23() {
        /// Java Code To Create Pyramid and Pattern
        int rows = 5, k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }

        // and pattern
        int rows1 = 5, k1 = 0, count = 0, count1 = 0;
        for (int i = 1; i <= rows1; ++i) {
            for (int space = 1; space <= rows1 - i; ++space) {
                System.out.print("  ");
                ++count;
            }
            while (k1 != 2 * i - 1) {
                if (count <= rows1 - 1) {
                    System.out.print((i + k1) + " ");
                    ++count;
                } else {
                    ++count1;
                    System.out.print((i + k1 - 2 * count1) + " ");
                }
                ++k1;
            }
            count1 = count = k1 = 0;
            System.out.println();
        }
    }
}
