import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        Instant instant = Instant.now();
        System.out.println(instant);


        LocalDateTime l1 = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(l1);

        ZonedDateTime z1 = instant.atZone(ZoneId.systemDefault());
        System.out.println(z1);


        LocalDateTime l2 = l1.plusDays(1);
        System.out.println(l2);
        System.out.println(l1.isAfter(localDateTime));

        System.out.println(ChronoUnit.HOURS.between(l1, l2));

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

    }
}
