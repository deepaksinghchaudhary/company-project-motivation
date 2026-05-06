import java.sql.Date;
import java.sql.Timestamp;

public class Classcastexception1 {
    
    public static void main(String[] args)
    {
        long seconds = System.currentTimeMillis();
Timestamp time = new Timestamp(seconds);
Date today = (Date)time;
    }
}
