package day19java;

public class MedicalInsurance {
	
	/**
	 * Encapsulation : 
	 * 
	 * 		- It is a process of grouping the data members[Variable] and method as a single unit called as encapsulation.
	 * 		- The purpose of Encapsulation is data hiding using modifiers.
	 * 
	 *  POJO - Plain Old Java Object
	 *  		--> A class which has only private data members and to access them outside of class 
	 *             we will be using public Getter and Setter methods.
	 *             
	 *  Characteristics of a POJO:
	 *  -------------------------
      - Public: A POJO class must be public.
      
      - Constructors: It should have a public default constructor and may also include argument constructors.
      
      - Getters and Setters: All objects within a POJO class should have public getters and setters for accessing their values.
      
       -Access Modifiers: While the object properties can have various access modifiers (such as private, public, or protected)
       , it’s recommended to keep instance variables private for better project security.
       
	 *Generating Getters and Setters: Right-click on your Java program.
      ==============================  Navigate to Source ➡️ Generate Getters and Setters.
                                      
      -Generating toString: Right-click on your Java program.
        =================   Navigate to Source ➡️ Generate toString.
                                                                 
	 */
	
	private String name;
	private int age;
	private String address;
	private int premiumamt;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPremiumamt() {
		return premiumamt;
	}
	public void setPremiumamt(int premiumamt) {
		this.premiumamt = this.premiumamt + premiumamt;
	}
	@Override
	public String toString() {
		return "MedicalInsurance [name=" + name + ", age=" + age + ", address=" + address + ", premiumamt=" + premiumamt
				+ "]";
	}
	
	/**public  MedicalInsurance(String name,int age,String address,int premiumamt) {
		
	this.name=name;
	this.age=age;
	this.address=address;
	this.premiumamt=premiumamt;
	
	}
	
	public void display() {
		
		System.out.println("Customer Name:"+name);
		System.out.println("Customer Age:"+age);
		System.out.println("Customer Address:"+address);
		System.out.println("Premium Amount for a Customer:"+premiumamt);
		
	}

	public static void main(String[] args) {
		
		MedicalInsurance customer= new MedicalInsurance("Keerthi",23,"Anna Nagar",1500000);
		
		customer.display();
	}
**/
}
