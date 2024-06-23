package day06java;

public class Looping {

	public static void main(String[] args) {

		/**
		 * Looping -> When we need to execute the one or group of statements for
		 * multiple times.
		 * 
		 * Looping Statement in Java 
		 * ========================= 
		 * 1. For Loop 
		 * 2. While Loop
		 * 3. Do While Loop 
		 * 4. For Each 
		 * 5. break
		 * 6. continue
		 * 
		 * For Loop : Syntax : (Initialization;Condition;Increament or Decreament) -
		 * Initialization ( will be executing only once) - Condition (Condition will be
		 * executed each time and when condition satisfies then it will enter in the
		 * statement) - Increament(Increament will be happening once the statement is
		 * executed)
		 * 
		 */

			Looping oLoop = new Looping();
			//oLoop.forLoop();
			//oLoop.forLoopWithBreak();
			//oLoop.forLoopWithConitnue();
			oLoop.whileLoop();
			//oLoop.doWhile();
		}
		
		public void forLoop() {
			for(int i=0;i<10;i++) {
				System.out.println("Welcome to Credo World....");
			}
		}
		
		public void forLoopWithBreak() {
			for(int i=0;i<10;i++) {
				if(i==5) {
					System.out.println("I value is : "+i);
					break;
				}
				System.out.println("Welcome to Credo World....");
			}
		}
		
		public void forLoopWithConitnue() {
			for(int i=0;i<10;i++) {
				if(i==5) {
					System.out.println("I value is : "+i);
					continue;
				}
				System.out.println("Welcome to Credo World....");
			}
		}
		
		public void whileLoop() {
			int i = 10;
			while(i < 10) {
				System.out.println("Welcome to Credo World....");
				i++;
			}
		}
		
		public void doWhile() {
			int i = 10;
			do {
				System.out.println("Welcome to Credo World....");
				i++;
			} while (i < 10);
		

	}

}
