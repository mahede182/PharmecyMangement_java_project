
package pharmecy_management;

public class Prescription extends Inventory{
//    protected String name;
//    protected String age;
//    protected String doctor;
//    protected String diseaseName;
//   
//    void input(){
//        System.out.println("======================================\r\n +++++   prescription  +++++ \r\n================================\r\n");
//        System.out.println("Enter Patient information");
//        System.out.println("Name: ");
//        name = scan.next();
//        System.out.println("Age: ");
//        age = scan.next();
//        diseaseName = scan.next();
//        
//    }
    public String DrugName;
    public int quantityPrescription;
    int lengthInventory;
    int lengthPrescription;
       
   
//   void display(){
//       System.out.println("======================================\r\n +++++   prescription  +++++ \r\n================================\r\n");
//       System.out.println("Doctor Name:"+docname);
//       System.out.println("Doctor Name:"+phone);
//       System.out.println("Patient Name:"+Name);
//       System.out.println("Age:"+Age);
//       System.out.println("Diseases Name:"+disease);
//    }
    public Prescription(String drugName, int quantityPrescription) {
		super();
		DrugName = drugName;
		this.quantityPrescription = quantityPrescription;
	}
    
    void Oparation1(){
        if(lengthPrescription==lengthInventory){
            if(lengthPrescription==lengthInventory){
                System.out.println("Drugs Are Available:");
            }
        }
        
//                stringCompare(string3, string4)
    }
    
    

	int operation2(){
        if(Quantity[i]<=quantityPrescription){
            System.out.println("Good enogh available");
        }
        else
            System.out.println("Pleaze buy Some"+DrugName);
        return quantityPrescription;
    }
	
}
