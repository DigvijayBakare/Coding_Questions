package systemClass;

import java.io.IOException;
import java.nio.channels.Channel;

// Java code illustrating lineSeparator(), inherentChannel() and identityHashCode() method

public class LineSeparatorInherentChannelMethod {
    public static void main(String args[]) throws NullPointerException, IOException {
        Integer x = 400;
        // printing identity hash code of integer x
        System.out.println(System.identityHashCode(x));

        // getting inherent channel
        Channel ch = System.inheritedChannel();
        System.out.println(ch);

        // line separator
        System.out.println(System.lineSeparator());
    }
}
