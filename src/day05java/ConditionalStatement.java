package day05java;

public class ConditionalStatement {

	public static void main(String[] args) {
		
			/**
			 * ConditionalStatement --> When we need to execute the statement based on some conditions .
			 * 		Input --> Boolean (true or false) .
			 * Types :
			 * =====
			 * 		- if
			 * 		- if else
			 * 		- if else if else
			 * 		- switch case
			 * 
			 */
				
				ConditionalStatement add = new ConditionalStatement();
				add.ifCondition();
				add.studentResult();
				add.studentResultWithGrade();
				add.compatibilityTesting();
			}
			
			public void ifCondition() {
				boolean hungry = false;
				if(hungry) {
					System.out.println("Lets have a meal.");
				}
				System.out.println("I will continue my work.");
			}
			
			public void studentResult() {
				int mark = 65;
				if(mark > 34) {
					System.out.println("Student is Passed.");
				}else {
					System.out.println("Student is Failed.");
				}
			}
			
			public void studentResultWithGrade() {
				int mark = -64;
				if(mark > 34 && mark < 60) {
					System.out.println("Student is Passed with Grade C");
				}else if(mark >= 60 && mark < 80) {
					System.out.println("Student is Passed with Grade B");
				}else if(mark >=80 && mark <=100) {
					System.out.println("Student is Passed with Grade A");
				}else if(mark < 0 || mark > 100) {
					System.out.println("Invalid Data ....");
				}
				else {
					System.out.println("Student is Failed.");
				}
			}
			
			public void compatibilityTesting() {
				String browerName = "Edge";
				switch (browerName) {
				case "Chrome":
					System.out.println("Script will be executing in "+browerName);
					break;
				case "Firefox":
					System.out.println("Script will be executing in "+browerName);
					break;
				case "Edge":
					System.out.println("Script will be executing in "+browerName);
					break;
				case "Opera":
					System.out.println("Script will be executing in "+browerName);
					break;
				case "Safari":
					System.out.println("Script will be executing in "+browerName);
					break;

				default:
					System.out.println("User input is not valid.");
					break;
				}
			}

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		}
