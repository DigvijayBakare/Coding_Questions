package TCS_NQT.String;

// Que: Remove all the spaces from the string

public class RemoveSpace {
    public static void main(String[] args) {
        // declare and print a string
        String str = "Remove all the spaces from the string";
        System.out.println("Original string: " + str);

        // remove spaces
        String str1 = "";
//        System.out.print("New string: ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            str1 = str1.concat(String.valueOf(str.charAt(i)));
//            System.out.print(str.charAt(i));
        }
        System.out.println("New string: " + str1);
    }
}
