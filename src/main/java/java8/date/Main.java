package java8.date;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate newyear = LocalDate.of(2023, Month.JANUARY,1);
        System.out.println(newyear);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        MonthDay independence = MonthDay.of(Month.AUGUST, 15);
        LocalDate independenceDay = independence.atYear(Year.now().getValue());
        System.out.println(independenceDay);


      //  ZoneId.getAvailableZoneIds().stream().forEach((zoneId) -> System.out.println(zoneId + " " + ( ZoneId.of(zoneId).getDisplayName(TextStyle.FULL, Locale.US))));

        LocalDateTime india = LocalDateTime.now();
        ZoneId zoneID = ZoneId.of("US/Pacific");
        ZonedDateTime zone = india.atZone(zoneID);
        System.out.println(" India " + india + " Aden " + zone);

        ZonedDateTime current = ZonedDateTime.now();
        System.out.println(current + " " + current.getZone());




    }

}
