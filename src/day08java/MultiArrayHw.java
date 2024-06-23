package day08java;

public class MultiArrayHw {

	public static void main(String[] args) {
		
		MultiArrayHw add= new MultiArrayHw();
		add.squarepattern();
		add.righthalfpattern();
		add.reverserighthalfpattern();
		add.numIncreaingPyramid();
		add.specificValue();
		add.multiSpecificValue();
		add.primeNumber();
	}
	public void squarepattern() {
		
		int i=5, n=6;
		char[][] pattern = new char[i][n];
		for( int a=0;a<i; a++) {
			for( int b=0; b<n; b++) {
				pattern[a][b]='*';
			}
		
			}
		for ( int a=0; a<i;a++) {
			for(int b=0;b<n;b++) {
				System.out.print(pattern[a][b]+" ");
			
		}
			System.out.println();
		}
		
		}
public void righthalfpattern() {
	int k=5;
	for(int a=1;a<=k;a++) {
		for( int b=1;b<=a;b++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public void reverserighthalfpattern() {
	int k=5;
	for( int a=1; a<=k; a++) {
		for( int b=1;b<=k-a+1; b++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public void numIncreaingPyramid() {
	int matrix[][]= {{1},{1,2},{1,2,3},{1,2,3,4},{1,2,3,4,5}};
	for(int iRow=0;iRow<matrix.length;iRow++) {
		for( int iCol=0; iCol<matrix[iRow].length;iCol++) {
			System.out.print(matrix[iRow][iCol]+" ");
			
		}
		System.out.println();
	}	
}
public void specificValue() {
	int k[]={20,40,60,80,100};
	int value=70;
	boolean found=false;
	for(int n:k) {
		if(n==value) {
			found=true;
		}
	}
	if(found) {
			System.out.println(value+"is found");
		}else {
			System.out.println(value+"is not found");
		}
	}
public void multiSpecificValue() {
	/*int array[][]= {{1,2,3},{4,5,6},{7,8,9}};//withoutLoop
	int value=1;
	int specificRow=1;
	int specificColumn=2;
	int specificvalue=array[specificRow][specificColumn];
	System.out.println("the value at the Row"+specificRow+" column"+specificColumn+" is "+specificvalue);
	
//using forLoop
 
 */
	int rows=5, columns=5;
	int value=1;
	int array[][]= new int[rows][columns];
	
	for(int i=0;i< rows;i++) {
		for(int j=0;j< columns;j++) {
			array[i][j]=value;
			value++;
		
		}
	}
	System.out.println("the 2d array is");
	for(int i=0;i<rows;i++) {
		for(int j=0;j< columns;j++) {
			System.out.print(array[i][j]+" ");
		}
		System.out.println();
	}
	int specificRow=1;
	int specificColumn=2;
	int specificvalue=array[specificRow][specificColumn];
	System.out.println("the value at the Row"+specificRow+" column"+specificColumn+" is "+specificvalue);
	
}
public void primeNumber() {

	 int[] array = {1,2,3,4,5,6,7,8,9,10};

	    // loop through the numbers one by one
	    for (int i = 0; i < array.length; i++) {
	        boolean isPrime = true;
	        if (array[i] == 1)
	            isPrime = false;
	        else {
	            // check to see if the numbers are prime
	            for (int j = 2; j <= array[i] / 2; j++) {
	                if (array[i] % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }
	        // print the number
	        if (isPrime){
	            if (array[i] == 0){}
	            else {
	                System.out.print(array[i] + " , ");
	            }
	    }}
	    System.out.println(" Are the prime number in the array ");
}
}
	


