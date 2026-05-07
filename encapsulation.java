public class encapsulation {

    String s ;

   public void setname( String s )
    {
      this.s = s;
    }

   public String getname()
     {
        return s;

     }
    
}

class test {
    public static void main(String[] args)
    {
        encapsulation n = new encapsulation();
        n.setname("github-commit");
        System.out.println(n.getname());
    }
}
