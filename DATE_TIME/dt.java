package DATE_TIME;
import java.time.*;
//import java.time.Instant;
public class dt{
    public static void main(String [] args)
    {
        LocalDateTime k= LocalDateTime.now();
        System.out.println(k);
        
        

        Instant t=Instant.now();
        System.out.println(t);
    }
    
}
