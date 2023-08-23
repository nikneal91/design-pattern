package java8.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;

public class Clocks {

    public static void main(String[] args) {

        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock + " " + clock.instant());

        Clock utc = Clock.systemUTC();
        System.out.println(utc + " "  + utc.instant());

        Clock offset = Clock.offset(utc, Duration.ofHours(5).plus(Duration.ofMinutes(30)));
        System.out.println("offset " + offset.instant());




        LocalDateTime utcTime = LocalDateTime.of(2023,Month.JANUARY.getValue(),12,10,50,0,0);
        ZonedDateTime utcZoneTime = utcTime.atZone((utc.getZone()));

        ZoneId indian = ZoneId.of("Asia/Calcutta");

        ZonedDateTime target = utcZoneTime.withZoneSameInstant(indian);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-M-yyyy hh:mm:ss a z");
        System.out.println(formatter.format(utcZoneTime));
        System.out.println(formatter.format(target) + " " + target);

    }

}
