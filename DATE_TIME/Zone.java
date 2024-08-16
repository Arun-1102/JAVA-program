package DATE_TIME;
import java.time.*;
public class Zone {
    public static void main(String[] args) {
        LocalTime l=LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println(l);

        LocalTime l1=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(l1);

        LocalTime l2=LocalTime.now(ZoneId.of("Indian/Cocos"));
        System.out.println(l2);

        LocalTime l3=LocalTime.now(ZoneId.of("Indian/Mayotte"));
        System.out.println(l3);
    }
    
}
