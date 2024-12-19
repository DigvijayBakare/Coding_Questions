package programizSiteQue.typeConversion;

public class Que7_14 {
    public static void main(String[] args) {
//        que8();     // Java Program to convert string type variables into int
//        que9();     // Java Program to convert int type variables to String
//        que10();    // Java Program to convert int type variables to double
//        que11();    // Java Program to convert double type variables to int
//        que12();    // Java Program to convert string variables to double
//        que13();    // Java Program to convert double type variables to string
        que14();    // Java Program to convert primitive types to objects and vice versa
    }
    private static void que8() {
        ///  Java Program to convert string type variables into int
        String a = "10";
        String b = "15";
        System.out.println("String: \na = " + a + "\t\tb = " + b);

        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        System.out.println("Integers: \nc = " + c + "\t\td = " + d);
    }
    private static void que9() {
        ///  Java Program to convert int type variables to String
        int a = 15;
        int b = 52;
        System.out.println("Integer: \na = " + a + "\t\tb = " + b);

        String c = String.valueOf(a);
        String d = String.valueOf(b);
        System.out.println("String: \nc = " + c + "\t\td = " + d);
    }
    private static void que10() {
        /// Java Program to convert int type variables to double
        int a = 10;
        System.out.println("Integer a = " + a);

        double b = a;
        System.out.println("Double a = " + b);
    }
    private static void que11() {
        /// Java Program to convert double type variables to int
        double a = 10.00;
        System.out.println("Double a = " + a);

        int b = (int) a;
        System.out.println("Integer a = " + b);
    }
    private static void que12() {
        /// Java Program to convert string variables to double
        String a = "10.00";
        System.out.println("String a = " + a);

        double b = Double.parseDouble(a);
        System.out.println("Integer a = " + b);
    }
    private static void que13() {
        /// Java Program to convert double type variables to string
        double a = 10.00;
        System.out.println("Double a = " + a);

        String b = String.valueOf(a);
        System.out.println("String a = " + b);


    }

    private static void que14() {
        /// Java Program to convert primitive types to objects and vice versa
        int a= 10;
        System.out.println("Primitive integer: " + a);

        Integer b = a;
        System.out.println("Object integer: " + b);

        int c = b;
        System.out.println("Primitive integer: " + c);
    }
}