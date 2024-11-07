package TCS_NQT.String;

// Que: Remove all vowels from the string

public class RemoveVowels {
    public static String removeVowels(String str) {
        // Using StringBuilder for efficient string manipulation
        StringBuilder sb = new StringBuilder();

        // Define vowels (both uppercase and lowercase)
        String vowels = "aeiouAEIOU";

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // If the character is not a vowel, append it to the StringBuilder
            if (vowels.indexOf(c) == -1) {
                sb.append(c);
            }
        }

        // Convert StringBuilder back to String
        return sb.toString();
    }

    public static void main(String[] args) {
        // declare and print a string
        String str = "Remove all vowels";
        System.out.println("Original string: " + str);

        // remove all the vowels
        String result = removeVowels(str);
        System.out.println("String after removing vowels: " + result);
    }
}
