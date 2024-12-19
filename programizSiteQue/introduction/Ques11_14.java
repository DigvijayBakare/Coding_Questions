package programizSiteQue.introduction;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Ques11_14 {
    public static void main(String[] args) {
        que11();        // Java Program to Find the Frequency of Character in a String
//        que12();        // Java Program to Remove All Whitespaces from a String
//        que13();        // Java Program to Round a Number to n Decimal Places
//        que14();        // Java Program to Check if a String is Empty or Null
    }

    private static void que11() {
        /// Java Program to Find the Frequency of Character in a String
        String str = "frequency ";
        System.out.println("Original String: " + str);
        char[] strA = str.toCharArray();
        int l = strA.length;
        boolean[] isA = new boolean[l];

        for (int i = 0; i < l; i++) {
            if (!isA[i]) {
                int count = 1;
                for (int j = i + 1; j < l; j++) {
                    if (strA[i] == strA[j]) {
                        count++;
                        isA[j] = true;
                    }
                }
                System.out.println("Character " + strA[i] + " has occurred " + count + " times.");
            }
        }
    }

    private static void que12() {
        /// Java Program to Remove All Whitespaces from a String
        String str = "Java programming language!";
        System.out.println("Original string: " + str);

        // removing all the white spaces in the given string
        str = str.replaceAll("\\s", "");
        System.out.println("New String: " + str);
    }

    private static void que13() {
        /// Java Program to Round a Number to n Decimal Places
        double variable = 3.0214569;
        System.out.println("Original number: " + variable);

        // first method
        System.out.format("%.5f",variable);
        System.out.println();

        // second method
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println("Round of number: " + df.format(variable));
    }

    private static void que14() {
        /// Java Program to Check if a String is Empty or Null
        String str1 = "";
        String str2 = null;
        String str3 = "Java";
        System.out.println("str 1: " + str1 +"\nstr 2: " + str2 + "\nstr 3: " + str3);

        // checking all the strings
        System.out.println("str 1 is empty or null: " + isNullOrEmpty(str1));
        System.out.println("str 2 is empty or null: " + isNullOrEmpty(str2));
        System.out.println("str 3 is empty or null: " + isNullOrEmpty(str3));
    }
    private static String isNullOrEmpty(String str) {
        if (str == null) {
            return "NULL";
        } else if (str.isEmpty()) {
            return "EMPTY";
        } else {
            return "The String is neither null nor empty!!";
        }
    }
}
