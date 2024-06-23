package day27java;

public class Finallyblock {
	/**
	 * The System.exit() method terminates the current program by shutting down the running Java virtual machine (JVM).
	 *It takes an integer argument called the exit status.
	 *When you call System.exit(0), it generally indicates successful termination of the program.
	 *Conversely, if you use System.exit(1) or any other non-zero value, it typically signifies unsuccessful termination or an abnormal exit.
	 * @param args
	 */
public static void main(String[] args) {
		
		int age[] = {26,29,33,36,40,45,31};
		try {
			for(int i=0;i<age.length;i++) {
				System.out.println(age[i]);
			}
			//System.exit(0);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}finally {
			System.out.println("Very important line of code should get executed always .");
		}
		
		System.out.println("************Rest of the code************");
		
	}

}
