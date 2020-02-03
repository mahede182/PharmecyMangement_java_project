
package pharmecy_management;

import java.util.Scanner;

public class Pharmecy_Management {

    public static void main(String[] args) {
        
        /*Patient design = new Patient();
        
        
        /*design.design();
        
        Inventory Iv=new Inventory();
        */
        /*Patient Pform = new Patient();
        Pform.input();
        Pform.display();
        
        Contact c = new Contact();
        //     c.display();
        
        
        Patient P = new Prescription();
        P.display();
        */ 
      
      Patient P = new Patient();
      Inventory I = new Inventory();
      Billing B = new Billing();
      Prescription Press= new Prescription("pevitin",15);
      Contact C = new Contact();
   
      while(true){
    	  Patient Home = new Patient();
      Home.design();
     System.out.println("Enter choise: ");
      int option;
      Scanner scan = new Scanner(System.in);
      option = scan.nextInt();
      switch(option)
      {
      case 1:
      System.out.println("++++++++++  1.Patient details +++++");
      P.design();
      P.input();
      P.display();
      
     
      break;
      
      case 2:
    	  System.out.println("+++++ 2. Inventory Details +++++");
    	  I.userOption();    
      break;
      
      case 3:
    	  System.out.println("+++++ 3. Billing Details +++++");
    	  
          Press.Oparation1();
          Press.operation2();
          B.Balance(option, option);
          
      break;
      case 4:
    	  System.out.println("+++++ 4. Contact Doctor +++++");
    	  C.display();
      break;
      case 5:
    	  System.exit(0);
      break;
      default:
      System.out.println("Wrong choise");
      }
      }
  
    }
    
}
