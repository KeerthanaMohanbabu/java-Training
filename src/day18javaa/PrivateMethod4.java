package day18javaa;

import day18java.PrivateMethod;

public class PrivateMethod4 extends PrivateMethod {

	//Here, we are creating a Different Package sub class by using "Import" we are importing previous package to current package.
	   //creating a relation b/w classes[parent & child] using "extends". 
	   //So in this case we can access only Protected and public
	
	public static void main(String[] args) {
		PrivateMethod4 obj= new PrivateMethod4();
		obj.add2();
		obj.add3();
	}

}
