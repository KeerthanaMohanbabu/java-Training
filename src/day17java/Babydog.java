package day17java;

public class Babydog extends Dog{

	public void show() { // method overriding
		
		System.out.println("babyDog is weeping");
	}
	public static void main(String[] args) {
		
		Babydog add=new Babydog();
		add.animal="Dog";
		add.show();
        System.out.println("***************");

		Multilevelinheritance add1= new Multilevelinheritance();
		add1.animal="Dog";
		add1.show();
		System.out.println("***************");
		
		Dog add2= new Dog();
		add2.animal="Dog";
		add2.show();
		System.out.println("***************");
		
		Multilevelinheritance add3=new Babydog();
		add3.animal="Dog";
		add3.show();
		System.out.println("***************");
		
		Multilevelinheritance add4=new Dog();
		add4.animal="Dog";
		add4.show();
		System.out.println("***************");
		
		Dog add5= new Babydog();
		add5.animal="Dog";
		add5.show();
	}

}
