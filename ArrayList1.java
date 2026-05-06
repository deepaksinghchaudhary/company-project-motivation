import java.util.ArrayList;
import java.util.Collections;
public class ArrayList1 {
    
     public static void main(String[] args)
     {
        ArrayList <String> s = new ArrayList<>();
        s.add("apple");
        s.add("mango");
        s.add("banana");
        s.add("juice");
        ArrayList<Integer> a = new ArrayList<>();
        a.add(6);
        a.add(9);
        a.add(3);
        a.add(6);
        System.out.println(a);
        for(String fruit:s)
        {
        System.out.println(fruit);

     }
     /* 
     s.remove("mango"); // remove method */
     s.set(2 , "bellcanada");
     s.remove(2);
     /* s.removeAll(s); */
     System.out.println(s);
     System.out.println(s.size());
     System.out.println(s.isEmpty());
    /*  s.clear(); */
     s.removeAll(s);
     System.out.println(s);
   }

    
}
