package day18java;

public class Modifier3 extends Modifier1{
	
	//Here, we are creating a relation to parent and child class using extends.Same package different sub class. 
	//only Default, protected and public will applicable.

	public static void main(String[] args) {
		Modifier3 add= new Modifier3();
		
		System.out.println("Default:"+add.idefault);
		System.out.println("Protected:"+add.iprotected);
		System.out.println("Public:"+add.ipublic);
		

	}

}
