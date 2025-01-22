package tdit;

public class ReverseString {
    /* program - reverse the string without changing the position of special chars
    input String s = "1#S45%KL@9"
    output result = "9#LK5%4S@1" */

    public static String reverseStringWithoutSpecialChar(final String str) {
        int len = str.length() - 1;             // length of the string - 1
        char[] chars = str.toCharArray();       // convert to character array

        int i = 0;                              // initialize with 0

        while (i < len) {
            // find first and last character
            char firstCh = str.charAt(i);
            char lastCh = str.charAt(len);

            if (!Character.isLetterOrDigit(firstCh)) {              // skip the char
                i++;
            } else if (!Character.isLetterOrDigit(lastCh)) {        // skip the char
                len--;
            } else {
                // swap the letters or digits
                char temp = chars[i];
                chars[i] = chars[len];
                chars[len] = temp;
                i++;
                len--;
            }
        }
        return String.copyValueOf(chars);
    }

    public static void main(String[] args) {
        // declare and print input string
//        String input = "1#S45%KL@9";
        String input = "4CH%JD5*7Y&BD";
        System.out.println("The input string: " + input);

        String string = reverseStringWithoutSpecialChar(input);
        System.out.println("The output string: "+ string);

        // reverse the string
        char[] chars = input.toCharArray();

        StringBuffer sb = new StringBuffer();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (Character.isLetterOrDigit(chars[i])) {
                sb.append(chars[i]);
            }
        }

        StringBuffer output = new StringBuffer();
        int i = 0;

        for (char c : chars) {
            if (!Character.isLetterOrDigit(c)) {
                output.append(c);
            } else {
                output.append(sb.charAt(i++));
            }
        }
        System.out.println("The output string: " +output);
    }
}
