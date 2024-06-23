package day18javaa;

import day18java.PrivateMethod;

public class PrivateMethod3 {

	//Here, we are creating a Different Package non sub class so using "Import" we are importing previous package to current package.
	   //So in this case we can access only public.
	
	public static void main(String[] args) {
	
		PrivateMethod obj= new PrivateMethod();
		obj.add3();
	}

}
