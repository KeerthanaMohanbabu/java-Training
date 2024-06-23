package day07java;

public class SingleArray {

	public static void main(String[] args) {
		
		SingleArray add = new SingleArray();
		 add.oddArray();
		 add.evenArray();
		 add.sumArray();
		 add.averageArray();
	}
	 public void oddArray() {
		 
		 int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};// Size of an Array is 20
		 for( int i=0; i<20;i++) {
		 
			 if(i%2==0) {
				 
				 System.out.print(a[i]+" ");// [i]--> index and ERROR--> ArrayIndexOutOfBoardsException.
			 }
		 }

	}
	 
	 public void evenArray() {
		 int b[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		 for(int k=0; k<20;k++) {
			
			 if(k%2==1) {
				 System.out.print(b[k]+" ");
			 }
		 }
	 }
	 public void sumArray() {
		int c[]= {1,2,3,4,5,6,7,8,9,10};// Size of an Array is 10
		for (int sum=0;sum<10;) {
			System.out.print(c[sum]);
			sum=sum+1;
		}
	 }
	 public void averageArray() {
		 int d[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		 int value=0;
		 for(int num:d) { //For Each Loop- :--> Iteration
			 value+=num;
		 }
		 int average= value/d.length;// length--> property
		 System.out.println(" the Average is:"+average);
	 }
}


