package DATE_TIME;
import java.time.*;
import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class period_duration {
   public static void main(String[] args) {
            LocalTime morning = LocalTime.of(10,30,45);
            LocalTime evening = LocalTime.of(5,20,32);
            System.out.println("Morning : " + morning);
            System.out.println("Evening : " + evening);
    
            Duration duration = Duration.between(morning,evening);
            System.out.println("Duration : " + duration);
    
            LocalDate start = LocalDate.of(2000,3,9);
            LocalDate end = LocalDate.of(2024,8,15);
            Period period = Period.between(start,end);
            System.out.println("Period : " + period);
    
            LocalDateTime starting = LocalDateTime.of(2004,5,16,8,01);
            LocalDateTime ending = LocalDateTime.of(2024,8,15,23,17);
    
            long daysBetween = ChronoUnit.DAYS.between(starting, ending);
            long HoursBetween1 = ChronoUnit.HOURS.between(starting, ending);
    
            System.out.println("Days :"+daysBetween);
            System.out.println("Hours :"+HoursBetween1);
        }
    }
    

