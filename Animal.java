abstract class animal {
         //abstract method 
      public abstract void sound ( ) ;
         }
     class lion extends animal {
      public void sound ( ) {
System.out.println("roar");
}
public static void main ( String args [ ] ) {
 animal obj = new lion ( );
obj. sound ();
}
}