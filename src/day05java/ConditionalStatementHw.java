package day05java;

public class ConditionalStatementHw {

	public static void main(String[] args) {
		
		
		ConditionalStatementHw add= new ConditionalStatementHw();
		add.fahrenheit();
		add.minutes();
		add.square();
		add.greater();
		add.greaterno();
		add.mark();
	}
    public void fahrenheit() {
    	
    	double fahrenheit=212, celsius;
    	 celsius = (fahrenheit-32)*5/9;
    	System.out.println("Celsius is:"+celsius);
    	
    	if(fahrenheit<-416.6) { //if( celsius <fahrenheit)
    		System.out.println("fahrenheit degree is not equal to celsius degree.");
    		
    	}else
    		
    	System.out.println(fahrenheit+"fahrenheit degree is equal to celsius degree:"+celsius);
    	
	}	
    
    public void minutes() {
    	
    	long minutes=3456789;
    	
    	if(minutes<0) {
    		System.out.println("Invalid Data..!");
    	}
    	else
    	{	
    		long hours = minutes/60;//hour=57,613.15
            long day   = hours/24;//day=2,400.54
            long years = day/365;//years=6.57
            long remainingDays = day % 365;//remainingDays=210
            System.out.println(minutes +" min is approximately "+ years+" years and "+remainingDays +"days");
        }
    }
    
    public void square() {
	
    	int length=10, breadth=10, square;
    	square=length*breadth;
    	if(length==breadth) {
    		System.out.println("Square is validate.");
    	}
    	else
    	{
    		System.out.println("Sqaure is not validate.");
    	}
    }
    
    	public void greater() {
    	    
    	        int gold = 50, silver = 20;

    	        if (gold == silver) {
    	        	
    	            System.out.println("Both numbers are equal");
    	            
    	        } else if (gold > silver) {
    	        	
    	            System.out.println(gold + " is greater number");
    	            
    	        }else
    	        
    	        {
    	        	System.out.println(silver + " is greater number");
    	    }
    	}
    	        public void greaterno() {
    	    	    
        	        int tea = 20, coffee = 30, water =10;

        	        if (tea >= coffee && tea >= water) {
        	        	
        	            System.out.println(tea+"is greater number");
        	            
        	        } else if (coffee >=tea && coffee >= water) {
        	        	
        	            System.out.println(coffee + " is greater number");
        	           
        	        }else	 {
        	        	
        	        	System.out.println(water + " is greater number");
        	    }
}
    
public void mark() {
	int mark=80;
	
	if (mark>=80 && mark<=100) {
		
		System.out.println("Student is Passed with Grade A");
		
	}else if (mark>=60 && mark<=80) {
		
		System.out.println("Student is passed with Grade B");
		
	}else if (mark>=50 && mark<=60) {
		
		System.out.println("Student is passed with Grade c");
	}else if (mark>=45 && mark<=50) {
		
		System.out.println("Student is passed with Grade D");
		
	}else if (mark>=25 && mark<=45) {
		
		System.out.println("Student is Failed with Grade E");
		
	}else if (mark<25 || mark<=0)  {
		
		System.out.println("Student is Failed with Grade F");
	}else {
		
		System.out.println("Invalid data...");

	}
}
   	   
    }
    
    
    
   
