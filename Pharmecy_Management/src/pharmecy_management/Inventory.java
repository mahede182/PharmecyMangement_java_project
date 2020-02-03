
package pharmecy_management;
import java.util.*;
public class Inventory{
	Scanner scan = new Scanner(System.in);
	
	String [] Name = new String[10];
	int [] Quantity = new int[10];
    double Price;
    int option;
	int n;
	int i;
	
     
    void userOption()
    {
        System.out.println("Enter choise: \n 1. List \n 2.Add");
        option = scan.nextInt();
        switch(option)
        {
            case 1:
                System.out.println("List");
                list();
                break;
            case 2:
                System.out.println("Add");
                Add();
                break;
            default:
                System.out.println("Wrong choise");
        }
    }
    void Add(){
    	System.out.println("+++++Medicine Input+++++\n\n");
    	System.out.println("Enter the Number of Drugs add");
    	n=scan.nextInt();
    	System.out.println("Enter Price:");
    	Price = scan.nextInt();
    	try{
    		for(i=1;i<=n;i++){
    		System.out.println("Name of"+i+">>");
    		Name [i]= scan.next(); 
    		System.out.println("Quantity "+i+">>");
    		Quantity[i]=scan.nextInt();
    	}
    	}
    	catch(Exception e){
    		System.out.print(e);
    	}	
    }
    
    double list(){
    	System.out.println("Weekend 1 Added list");
        System.out.println("+++++Medicine List+++++");
        
        for(i=1;i<=10;i++){
    		System.out.println("Name:"+Name[i]);
    		if(Name[i]==Name[i]){
    			Quantity[i] += Quantity[i];
    		}
    		System.out.println("Quantity:"+Quantity[i]); 
    	}
        System.out.println("Price:"+Price);
        return Price;       
    }
}
