package pharmecy_management;
public class Contact{
    
    public String docname;
    String Id;
    String phone;
    String email;
    String Department;
    String address;

    public Contact() {
        this.docname = "Ashis kumar Datta";
        this.Id = Id;
        this.phone = "+880162536462";
        this.email = email;
        this.Department = Department;
        this.address = address;
    }
    public String getName() {
        return docname;
    }

    public void setName(String name) {
        this.docname = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = "Dentist";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
     void display(){
    	 int[] DocDetails = new int[20];
    	 int i;
    	 for(i=1;i<5;i++){
    		 System.out.println("ID.:>>"+i);
         System.out.println("Name : Ashis kumar Datta");
         System.out.println("phone: +880162536462"); 
         System.out.println("Email: Ashis.sarker123@gamil.com");
         System.out.println("address :32/A, Block B, Dahnmondi");
         System.out.println("Department: endocrine\n");
         
         if(i==2){
        	 System.out.println("ID.:>>"+i+i);
             System.out.println("Name : Shohan Saha Aupo");
             System.out.println("phone: +8801*****462"); 
             System.out.println("Email: Shohan.saha123@gamil.com");
             System.out.println("address :24/c, Block C, comilla");
             System.out.println("Department: endocrine\n");
         }
         if(i==3){
        	 System.out.println("ID.:>>"+i+i);
             System.out.println("Name : Khalid ");
             System.out.println("phone: +88016****62"); 
             System.out.println("Email: Khalid.145@gamil.com");
             System.out.println("address :43/A, bashundhara B, banani");
             System.out.println("Department: endocrine\n");
         }
         if(i==4){
        	 System.out.println("ID.:>>"+i+i);
             System.out.println("Name : Dr. Mohammad Jahangir Talukder ");
             System.out.println("phone: +88016****62"); 
             System.out.println("Email: jaha.545@gamil.com");
             System.out.println("address :43/A, bashundhara.");
             System.out.println("Department: endocrine\n");
         }
         
    	 }
         
         
     }
     void input()
     {
         
     }
}
