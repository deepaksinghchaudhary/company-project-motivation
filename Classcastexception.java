import java.sql.Timestamp;
public class Classcastexception {

    public static void main(String[] args){

        Date today = new Date();
        Timestamp time = (Timestamp)today;
        System.out.println(time);



    }
    
}
