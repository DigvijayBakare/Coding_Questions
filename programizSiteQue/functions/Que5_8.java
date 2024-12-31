package practice.programizSiteQue.functions;

public class Que5_8 {
    public static void main(String[] args) {
//        que5();     // Java Program to Convert Binary Number to Decimal and vice-versa
//        que6();     // Java Program to Convert Octal Number to Decimal and vice-versa
//        que7();     // Java Program to Convert Binary Number to Octal and vice-versa
        que8();     // Java Program to Reverse a Sentence Using Recursion
    }

    private static void que5() {
        /// Java Program to Convert Binary Number to Decimal and vice versa
        // binary number
        long num = 110110111;

        // call method by passing the binary number
        int decimal = convertBinaryToDecimal(num);

        System.out.println("Binary to Decimal");
        System.out.println(num + " = " + decimal);

        // binary number
        String binary = "01011011";

        // convert to decimal using parseInt method
        int method = Integer.parseInt(binary, 2);
        System.out.println(binary + " in binary = " + method + " in decimal.");

        // decimal number
        int decimal1 = 91;

        // convert decimal to binary
        String binary1 = Integer.toBinaryString(decimal1);
        System.out.println(decimal1 + " in decimal = " + binary1 + " in binary.");
    }

    private static void que6() {
        /// Java Program to Convert Octal Number to Decimal and vice-versa
        int decimal = 78;
        int octal = convertDecimalToOctal(decimal);
        System.out.printf("%d in decimal = %d in octal", decimal, octal);

        // decimal to octal
        int octal1 = 116;
        int decimal1 = convertOctalToDecimal(octal1);
        System.out.printf("\n%d in octal = %d in decimal", octal1, decimal1);
        System.out.println();
    }

    private static void que7() {
        /// Java Program to Convert Binary Number to Octal and vice-versa
        String binaryInput = "101101";
        String octalInput = "57";

        // Binary to Octal Conversion
        int decimalFromBinary = convertBinaryToDecimal(Integer.parseInt(binaryInput));
        String octalFromBinary = String.valueOf(convertDecimalToOctal(decimalFromBinary));
        System.out.println("Binary: " + binaryInput + " -> Octal: " + octalFromBinary);

        // Octal to Binary Conversion
        int decimalFromOctal = convertOctalToDecimal(Integer.parseInt(octalInput));
        String binaryFromOctal = String.valueOf(convertDecimalToBinary(decimalFromOctal));
        System.out.println("Octal: " + octalInput + " -> Binary: " + binaryFromOctal);
    }

    private static void que8() {
        /// Java Program to Reverse a Sentence Using Recursion
        String str = "Hello, this is the word of Java";
        System.out.println("Original sentence: " + str);

        // reversing a sentence using recursion
        String sentence = reverseSentence(str);
        System.out.println("New sentence: " + sentence);
    }

    private static int convertBinaryToDecimal(long num) {
        int decimalNumber = 0, i = 0;
        long remainder;
        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }

    private static long convertDecimalToBinary(int n) {
        long binaryNumber = 0;
        int remainder, i = 1, step = 1;
        while (n != 0) {
            remainder = n % 2;
//            System.out.println("Step " + step++ + ": " + n + "/2");
//            System.out.println("Quotient = " + n / 2 + ", Remainder = " + remainder);
            n /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        return binaryNumber;
    }

    private static int convertOctalToDecimal(int octal) {
        int decimalNumber = 0, i = 0;
        while (octal != 0) {
            decimalNumber += (octal % 10) * Math.pow(8, i);
            ++i;
            octal /= 10;
        }
        return decimalNumber;
    }

    private static int convertDecimalToOctal(int decimal) {
        int octalNumber = 0, i = 1;
        while (decimal != 0) {
            octalNumber += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }
        return octalNumber;
    }

    private static String reverseSentence(String sentence) {
        // Base case: for empty sentence
        if (sentence.isEmpty() || sentence.indexOf(' ') == -1) {
            return sentence;
        }

        // First case: finding first space's index
        int firstSpace = sentence.indexOf(' ');

        // Extracting first word and rest of the sentence
        String firstWord = sentence.substring(0, firstSpace);
        String restSentence = sentence.substring(firstSpace + 1);

        // Reverse the sentence and add the first word to the end of the sentence
        return reverseSentence(restSentence) + " " + firstWord;
    }
}