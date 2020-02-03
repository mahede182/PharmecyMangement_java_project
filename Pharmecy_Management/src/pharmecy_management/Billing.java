
package pharmecy_management;

public class Billing{
	protected double Amount;

    
    
//    public Billing(int lengthInventory, int lengthPrescription) {
//        super(lengthInventory, lengthPrescription);
//    }
    
	public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = 0;
    }
    
    void Balance(double Price,int quantityPrescription){
        Amount = Price*quantityPrescription;
        System.out.println("Your Amount is:"+Amount);
    }
   
   
}
