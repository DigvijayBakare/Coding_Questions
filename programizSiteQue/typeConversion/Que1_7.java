package programizSiteQue.typeConversion;

import java.util.Arrays;

public class Que1_7 {
    public static void main(String[] args) {
//        que1();     // Java Program to Convert Character to String and Vice-Versa
//        que2();     // Java Program to convert char type variables to int
//        que3();     // Java Program to convert int type variables to char
//        que4();     // Java Program to convert long type variables into int
//        que5();     // Java Program to convert int type variables to long
//        que6();     // Java Program to convert boolean variables into string
        que7();     // Java Program to convert string type variables into boolean
    }

    private static void que1() {
        /// Java Program to Convert Character to String and Vice-Versa
        // converting character to String
        char character = 'c';
        System.out.println("Character: " + character + "\nString: " + Character.toString(character));

        // character array to string
        char[] charArray = {'a', 'e', 'i', 'o', 'u'};
        System.out.println("Character array: " + Arrays.toString(charArray));
        String str1 = String.valueOf(charArray);
        String str2 = new String(charArray);
        System.out.println("Using valueOf method: " + str1);
        System.out.println("Using string's constructor: " + str2);

        // string to character array
        String str3 = "This is String";
        System.out.println("String: " + str3 + "\nCharacter: " + Arrays.toString(str3.toCharArray()));
    }

    private static void que2() {
        /// Java Program to convert char type variables to int
        char a = '5', b = 'c', c = '7';
        System.out.println("Characters taken: \na = " + a + "\t\tb = " + b + "\t\tc = " + c);

        // character variable to int ASCII value
        int m = a, n = b, o = c;
        System.out.println("Character variable to int ASCII value: \nm = " + m + "\t\tn = " + n + "\t\to = " + o);

        // char variables to int using getNumericValue()
        System.out.println("Character variable to int using getNumericValue() method: \na = " + Character.getNumericValue(a) + "\t\tb = " + Character.getNumericValue(b) + "\t\tc = " + Character.getNumericValue(c));

        // convert char to int value using Integer.parseInt()
        System.out.println("Character variable to int using Integer.parseInt() method: \na = " + Integer.parseInt(String.valueOf(a)) + "\t\tc = " + Integer.parseInt(String.valueOf(c)));

        // convert char to int by subtracting char 0
        System.out.println("Character variable to int using char 0 subtraction: \nm = " + (a - '0') + "\t\tn = " + (b - '0') + "\t\to = " + (c - 'o'));
    }

    private static void que3() {
        /// Java Program to convert int type variables to char
        int a = 99;
        int b = 101;
        System.out.println("Integers: \na = " + a + "\t\tb = " + b);

        char c = (char) a;
        char d = (char) b;
        System.out.println("Characters: \nc = " + c + "\t\td = " + d);
    }

    private static void que4() {
        /// Java Program to convert long type variables into int
        long a = 2322331L;
        long b = 52341241L;
        System.out.println("Long numbers: \na = " + a + "\t\tb = " + b);

        int c = (int) a;
        int d = (int) b;
        System.out.println("Integer number: \nc = " + c + "\t\td = " + d);
    }

    private static void que5() {
        /// Java Program to convert int type variables to long
        int a = 2322331;
        int b = 52341241;
        System.out.println("Integer numbers: \na = " + a + "\t\tb = " + b);

        long c = a;
        long d = b;
        System.out.println("Long number: \nc = " + c + "\t\td = " + d);
    }

    private static void que6() {
        /// Java Program to convert boolean variables into string
        boolean a = true;
        boolean b = false;
        System.out.println("Booleans: \na = " + a + "\t\tb = " + b);

        String c = String.valueOf(a);
        String d = String.valueOf(b);
        System.out.println("String: \nc = " + c + "\t\td = " + d);
    }

    private static void que7() {
        /// Java Program to convert string type variables into boolean
        String a = "true";
        String b = "false";
        System.out.println("String: \na = " + a + "\t\tb = " + b);

        boolean c = Boolean.parseBoolean(a);
        boolean d = Boolean.parseBoolean(b);
        System.out.println("Boolean: \nc = " + c + "\t\td = " + d);
    }
}