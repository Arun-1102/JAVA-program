package DATE_TIME;
import java.util.*;
import java.time.ZoneId;

import java.nio.channels.Pipe.SourceChannel;
import java.time.*;
public class leapyear {
    public static void main(String[] args) {
        
        LocalDate t=LocalDate.now();
        System.out.println(t);
        System.out.println("leap year: "+t.isLeapYear());
        System.out.println(t.plusDays(3));
        System.out.println();

        for(String val : ZoneId.getAvailableZoneIds())
        {
        System.out.println(val);
        }

    }
}
