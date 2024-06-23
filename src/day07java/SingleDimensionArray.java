package day07java;

public class SingleDimensionArray {

	/**
	 * Array --> Array is used to store the multiple values with same type of data with the same variable name .
	 * 		 --> We can retrieve the value from an Array using an Index.
	 * 		 --> Array index will be always starts with 0.
	 * 
	 * DisAdvantage of an Array
	 * =========================
	 * 		--> Array size is fixed, which mean we can not increase or decrease the size of an array during runtime.
	 * 		--> Using an Array we can store and retrieve the values, But we can not manipulate it . i.e.
	 * 			we can not edit or delete the value from an array.
	 * 
	 * Types of an Array
	 * =================
	 * 		--> Single Dimension Array
	 * 		--> Multi-Dimension Array
	 */
	public static void main(String[] args) {
		
		// Different methods of array--> declaring variable.
		
		int a[] = {10,20,30,40,50,60,70,80,90,100,111,222,333}; // Size of an array is 7
		int []b = {10,20,30,40,50,60,70};
		int [] c = {10,20,30,40,50,60,70};
		int[] d = {10,20,30,40,50,60,70};
		int e[] = new int[5];
		e[0] = 100;
		e[1] = 200;
		//System.out.println(a);
		System.out.println("Size of an array is : "+a.length);
		//System.out.println(a[4]);
		for(int i=0;i < a.length;i++) {
			System.out.println(a[i]);
		}
	System.out.println("***************************");	
		// For Each
		for(int value : a) {
			System.out.println(value);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
