package practice.java8.javatechonline;

// How to convert String to Date Object using Java 8 ?

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class StringToDate {
    public static void main(String[] args) throws ParseException {
        //String to a java.util.Date
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a", Locale.ENGLISH);
        String dateInString = "24-May-2021 9:45:30 AM";
        Date date = dateFormatter.parse(dateInString);
        System.out.println(date);

        //String to a java.time.LocalDate
        LocalDate localDate = LocalDate.parse("2021-05-24");
        System.out.println(localDate);

        //String to a java.time.LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.parse("2021-05-24T21:45:30");
        System.out.println(localDateTime);

        //String to a java.time.ZonedDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2021-05-24 21:45:30 America/New_York", formatter);
        System.out.println(zonedDateTime);
    }
}
