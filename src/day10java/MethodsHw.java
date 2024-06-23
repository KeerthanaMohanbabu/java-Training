package day10java;

public class MethodsHw {

	public static void main(String[] args) {
		MethodsHw add= new MethodsHw();
		add.sum(100, 20);
		add.sub(50,25);
		add.mul(120, 4);
		add.div(550, 6);
int value01=add.isum(100, 263);
System.out.println("value of 2 number:"+value01);

int value02=add.isub(100, 59);
System.out.println("value of 2 number:"+value02);

int value03=add.imul(15, 23);
System.out.println("value of 2 number:"+value03);

double value04=add.idiv(160,16);
System.out.println("value of 2 number:"+value04);
System.out.println("****************");

add.allvalues(value01);

	}
	
	public void sum(int a,int b) {
		System.out.println("Sum of 2 variable is:"+(a+b));
	}
	
	public void sub(int c,int d) {
		System.out.println("Subraction of 2 variable is:"+(c-d));
	}
	public void mul(int e,int f) {
		System.out.println("Multipication of 2 variable is:"+(e*f));
	}
	public void div(double g,double h) {
		System.out.println("Division of 2 variable is:"+(g/h));
		System.out.println("****************");
	}
	public int isum(int a,int b) {
		int sum1=a+b;
		System.out.println("Sum of 2 variable is:"+sum1);
		return sum1;
	}
	
	public int isub(int c,int d) {
		int sum2=c-d;
		System.out.println("Subraction of 2 variable is:"+sum2);
		return sum2;
	}
	public int imul(int e,int f) {
		int sum3=e*f;
		System.out.println("Multipication of 2 variable is:"+sum3);
		return sum3;
	}
	public double idiv(double g,double h) {
		double sum4=g/h;
		System.out.println("Division of 2 variable is:"+sum4);
		return sum4;
		
	}
	public void allvalues(int value) {
		System.out.println("SUM VALUE:"+value);
	}
}
