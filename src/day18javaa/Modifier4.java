package day18javaa;

import day18java.Modifier1;

public class Modifier4 {
	
	//Here, we are creating a Different Package non sub class so using "Import" we are importing previous package to current package.
   //So in this case we can access only public.

	public static void main(String[] args) {
		
		Modifier1 add= new Modifier1();
	
		System.out.println("Public:"+add.ipublic);
		
	}

}
