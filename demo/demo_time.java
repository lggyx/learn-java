import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class demo_time {

    public static void main(String[] args) {
        // LocalDate
        LocalDate date = LocalDate.now();
        System.out.println(date);
        // LocalTime
        LocalTime time = LocalTime.now();
        System.out.println(time);
        // LocalDateTime
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        // Instance
        Instant instant = Instant.now();
        System.out.println(instant);
        // Duration
        Duration duration = Duration.ofDays(1);
        System.out.println(duration);
        // Period
        Period period = Period.ofDays(1);
        System.out.println(period);
        // ZoneId
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        // ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        // DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println(formattedDateTime);
        // Date
        Date date1 = new Date(0);
        System.out.println(date1);
        // Calendar
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        //SimpeDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = sdf.format(date1);
        System.out.println(formattedDate);
    }
}
