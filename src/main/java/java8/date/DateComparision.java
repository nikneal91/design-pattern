package java8.date;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;

public class DateComparision {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime feb = LocalDateTime.of(Year.now().getValue(), Month.FEBRUARY, DayOfWeek.MONDAY.getValue(),2,3);

        System.out.println("is After " + now.isAfter(feb));
        System.out.println("is Before " + now.isBefore(feb));
        System.out.println("Are equal " + now.isEqual(feb));
        System.out.println("Difference " + now.compareTo(feb));

    }
}
