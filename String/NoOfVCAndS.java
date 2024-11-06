package TCS_NQT.String;

// Que: Count number of vowels, consonants and spaces in the string

import java.util.Locale;

public class NoOfVCAndS {
    public static void main(String[] args) {
        // declare a string and print it
        String string = "What is the meaning of this!!";
        string = string.toLowerCase();
        System.out.println("Original string: " + string);

        // counting the vowels, consonants and spaces
        int vowel = 0;
        int space = 0;
        int consonant = 0;
        int sChar =0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o'
                    || string.charAt(i) == 'u') {
                vowel++;
            } else if (string.charAt(i) == ' ') {
                space++;
            } else if (string.charAt(i) == '!' || string.charAt(i) == '@' || string.charAt(i) == '$'
                    || string.charAt(i) == '%' || string.charAt(i) == '*') {
                sChar++;
            } else {
                consonant++;
            }
        }
        System.out.println("The number of vowels, consonants and spaces in the given string: " +
                "\nVowels: " + vowel + "\nConsonants: " + consonant + "\nSpaces: " + space+"\nSpecial Characters: " + sChar);
    }
}
