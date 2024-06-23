package day18javaa;

import day18java.Modifier1;

public class Modifier5 extends Modifier1{
	
	//Here, we are creating a Different Package sub class by using "Import" we are importing previous package to current package.
   //creating a relation b/w classes[parent & child] using "extends". 
   //So in this case we can access only Protected and public.
	
	public static void main(String[] args) {
		
		Modifier5 add= new Modifier5();
		
		System.out.println("Protected:"+add.iprotected);
		System.out.println("Public:"+add.ipublic);
		
	}

}
