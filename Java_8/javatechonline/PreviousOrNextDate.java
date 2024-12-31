package practice.java8.javatechonline;

// How to find next/previous(tomorrow/yesterday) date using Java 8?

import java.time.LocalDate;

public class PreviousOrNextDate {
    public static void main(String[] args) {
        // starting date
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);
        System.out.println("Tomorrow's date: " + getNextDay(today));
        System.out.println("Yesterday's date: " + getPrevDay(today));
    }

    private static LocalDate getNextDay(LocalDate localdate) {
        return localdate.plusDays(1);
    }

    private static LocalDate getPrevDay(LocalDate localdate) {
        return localdate.minusDays(1);
    }
}
