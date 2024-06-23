package day17java;

public class Result {

	public static void main(String[] args) {
		
			Tiger add= new Tiger();
			add.animal="Tiger";
			add.display();
			System.out.println("*************");
			
			Hierarchical add1= new Hierarchical();
			add1.animal="Tiger";
			add1.display();
			System.out.println("*************");

			Cow add2= new Cow();
			add2.animal="Tiger";
			add2.display();
			System.out.println("*************");

			Hierarchical add3= new Tiger();
			add3.animal="Tiger";
			add3.display();
			System.out.println("*************");

			Hierarchical add4= new Cow();
			add4.animal="Tiger";
			add4.display();
			System.out.println("*************");
			
			
	}
	
	

	}


