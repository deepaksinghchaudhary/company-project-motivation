
public class Employee  {
    static String eName;
    static String location;
    static String geteName() {
     return eName;
    }
    public void seteName(String eName) {
     this.eName = eName;
    }
    public String getLocation() {
     return location;
    }
    public void setLocation(String location) {
     this.location = location;
    }
   }
   public class mainc {
    public static void main(String[] args) {
     Employee employee = new Employee();
     employee.seteName("Jhon");
     employee.setLocation("Chicago");
     System.out.println(employee.geteName());
    }
   }
    

