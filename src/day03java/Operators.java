package day03java;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Arithmetic operators (+,-,*,/,% - Modular)
		
int shirt=200;

System.out.println("white shirt price:"+(shirt+20));

System.out.println("black shirt price:"+(shirt-10));

System.out.println("red shirt price:"+(shirt*2));

System.out.println("blue shirt price:"+(shirt/1));

System.out.println("button price:"+(shirt%9));

// Assignment operators (=,+=,-=,*=,/=,%=)	
		
int books=450;
books+=100;

System.out.println("no of books:"+books);

books-=450;
System.out.println("no of horror books:"+books);

books*=2;
System.out.println("no of comedy books:"+books);

books/=3;
System.out.println("no of technology books:"+books);

books%=10;
System.out.println("no of fair books:"+books);


// Comparison Operator (<,>,<=,>=,!=,==) --> boolean

int berry=200;
int mango=220;
int apple=240;

System.out.println("berry is lesser than mango :"+(berry<mango));

System.out.println("Mango is greater than apple :"+(mango>apple));

System.out.println("berry is <= mango :"+(berry<=mango));

System.out.println("apple is >= mango :"+(apple>=mango));

System.out.println("apple is != mango :"+(berry!=mango));

System.out.println("berry is == mango :"+(berry==mango));


// Unary Operator (++,--)

int year = 2023;

System.out.println("LNewyear : "+(year++));//2023

System.out.println("Newyear : "+year);//2023+1=2024

int newyear = 2024;

System.out.println("Newyear : "+(newyear--));//2024

System.out.println("LNewyear : "+(newyear));//2024-1=2023

// Logical Operator (&& - AND,|| - OR,! - NOT)  --> boolean

int a=10, b=20, c=30;

System.out.println("And :"+((a>b)&&(b<=c)));
System.out.println("OR :"+((a>b)||(b<=c)));
System.out.println("NOT :"+!((a>b)||(b<=c)));



	}

}
	