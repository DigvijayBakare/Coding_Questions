package systemClass;

import java.io.Console;
import java.util.Currency;
import java.util.Locale;

public class ConsoleMethod {
    public static void main(String args[]) throws NullPointerException {
        Console c = System.console();
        if (c != null) {
            Currency currency = Currency.getInstance(Locale.ITALY);
            c.printf(currency.getSymbol());
            c.flush();
        } else
            System.out.println("No console attached");
    }
}
