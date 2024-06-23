package day06java;

public class LoopHw {

	public static void main(String[] args) {
		
		LoopHw add = new LoopHw();
add.even();
add.odd();
add.sum();
add.loopBreak();
add.loopContinue();
	}
private void odd() {
		int n=1;
		while(n<=20) {
			if(n%2==1) {
				System.out.print("odd number:"+n);
				
			}
			n++;
		}
		
	}
public void even() {
	for( int a = 1; a<=20; a++) {
		if(a%2==0)
		System.out.print("even number:"+a);

}
}
public void sum() {
	
 int sum=1;
	  while(sum<11) {
		 System.out.println(sum);
		 sum=sum+1;
		
 }	 
}

public void loopBreak() {
	
	for(int i=0;i<10;i++) {
		if(i==4) {
			System.out.println("I value is : "+i);
			break;
		}
		System.out.println("Welcome to house of coffee....");
	}
}

public void loopContinue() {
	for( int b=0;b<10;b++) {
		if(b==3){
			System.out.println("B value is:"+b);
			continue;
		}
		System.out.println("welcome to world of kiki..");
		}
	}
}








