
package pharmecy_management;
import java.util.Scanner;
public class Patient{
     String Name;
    protected String Address;
    protected String Email;
    protected String disease;
     String Age;
    Scanner scan = new Scanner(System.in);

//    public Patient(String Name, String Age) {
//        this.Name = Name;
//        this.Age = Age;
//    }

  
    
    void design(){
        System.out.println("\t\t======================================================");
        System.out.println("\t\t++++          PHARMACY MANAGEMENT         ++++\t\t          ");
        System.out.println("\t\t======================================================");
        System.out.println("1. Patient Details: ");
        System.out.println("2. Inventory Details: ");
        System.out.println("3. Billing Details: ");
        System.out.println("4. Contact Doctor");
        System.out.println("5. Exit");
    }
    
    void input()
    {
        System.out.println("\n\n+++++++   Patient Form: +++++\n\n");
        
        System.out.println("Patient Name:");
        Name = scan.next();
        System.out.println("Address:");
        Address=scan.next();
        System.out.println("Email:");
        Email=scan.next();
        System.out.println("Disease Name:");
        disease=scan.next();
        System.out.println("Pationt Age:");
        Age=scan.next();
    }
    void display()
    {
        System.out.println("patient display:");
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Address: "+Address);
        System.out.println("Email: "+Email);
        
    }
      public Patient() {
        this.Name = Name;
        this.Age = Age;
    }
    
}
