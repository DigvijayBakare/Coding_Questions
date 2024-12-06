package systemClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class InOutErrorMethod {
    public static void main(String args[]) throws IOException {
        // creating objects of file input stream and file output stream
        FileInputStream IN = new FileInputStream("D:\\Coding\\JAVA\\Codes\\Practice_Coding\\src\\systemClass\\input.txt");
        FileOutputStream OUT = new FileOutputStream("system.txt");

        // set input stream
        System.setIn(IN);
        char c = (char) System.in.read();
        System.out.print(c);

        // set output stream
        System.setOut(new PrintStream(OUT));
        System.out.write("Hi Abhishek\n".getBytes());

        // set error stream
        System.setErr(new PrintStream(OUT));
        System.err.write("Exception message\n".getBytes());
    }
}
