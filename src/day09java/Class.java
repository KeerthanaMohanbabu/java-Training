package day09java;

public class Class {
	
	/**
	 * Class -> It is a blue print which has common properties and actions used across all the object 
	 *          which we are creating for the class. 
	 * Object --> Its an instance created for the class.
	 * 
	 * Example : CAR
	 * 
	 * Properies  --> Varible
	 * =========
	 * 		Brand Name
	 * 		Model
	 * 		color
	 * 		petrol/diesel
	 * 		no of seats
	 * 		no of wheels
	 * 
	 * Actions --> Methods
	 * =======
	 * 		- Move forward
	 * 		- Move backward
	 * 		- Turning
	 * 		- Breaking
	 * 		- Open Airbags
	 *     	- Horn
	 * 
	 */
	
	String name;
	String address;
	long mobile;
	String website;
	String[] courses = {"Java","Selenium","HTML","API Automation","CSS","Angular"};
	int noOfclassroom;
	
	public void counselling() {
		System.out.println("Institute will provide the counselling to the student.");
	}
	
	public void demo() {
		System.out.println("Institute will provide the demo session to the student.");
	}
	
	public void registration() {
		System.out.println("Institute will do the registration for the student.");
	}
	
	public void watsUpGroup() {
		System.out.println("Institute will create a wats up group.");
	}
	
	public void hybridModel() {
		System.out.println("Institute will be having online or offline or Hybrid mode of training.");
	}
	
	public void display() {
		System.out.println("Institute Name : "+name);
		System.out.println("Institute Address : "+address);
		System.out.println("Institute Contact Details : "+mobile);
		System.out.println("Institute Website : "+website);
		System.out.println("Institute no of classrooms are : "+noOfclassroom);
		if(courses.length > 0) {
			System.out.println("**********List of training courses**********");
			for (String course : courses) {
				System.out.println(course);
			}
		}else {
			System.out.println("No course details are provided.");
		}
	}
	
	public static void main(String[] args) {
		Class credo = new Class();
		credo.name = "Credo Systemz";
		credo.address = "Velacherry";
		credo.mobile = 9841140890L;
		credo.website = "www.credosystemz.com";
		credo.noOfclassroom = 8;
		credo.counselling();
		credo.demo();
		credo.registration();
		credo.watsUpGroup();
		credo.hybridModel();
		credo.display();
		
		Class udemy = new Class();
		udemy.name = "Udemy";
		udemy.address = "Everywhere";
		udemy.mobile = 45654634664650L;
		udemy.website = "www.udemy.com";
		udemy.noOfclassroom = 0;
		udemy.counselling();
		udemy.demo();
		udemy.registration();
		udemy.watsUpGroup();
		udemy.hybridModel();
		udemy.display();

	}



	

	}


