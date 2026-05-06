import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class ArrayLIST2 {

    public static void main(String[] args)
    {
        ArrayList<String> sop = new ArrayList<>();
        sop.add("apple");
        sop.add("mango");
        sop.add("jackfruit");
        System.out.println(sop);
        String[] arr = new String[sop.size()];
        sop.toArray(arr);
        System.out.println("normalarray");
        for(String s:arr)
        {
            System.out.println(s);
        }

    }
    
}
