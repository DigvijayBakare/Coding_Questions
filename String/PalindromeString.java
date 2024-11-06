package TCS_NQT.String;

// Que: Check if a given string is palindrome or not

public class PalindromeString {
    public static void main(String[] args) {
        // declare and print a string
        String str = "madamas";
        System.out.println("Original string: " + str);

        // check if given string is palindrome or not
        boolean isPalindrome = false;
        StringBuffer sb = new StringBuffer(str);
        sb = sb.reverse();
        String str1 = new String(sb);
        if (str1.equals(str)) {
            System.out.println("The given string is palindrome: " + true);
        } else System.out.println("The given string is not palindrome: " + false);
    }
}
