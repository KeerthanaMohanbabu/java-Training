package day18java;

public class Modifier2 {
	
	//Here, Private will not accessible because private will use with in the current class.
	//same package non sub class.only Default, protected and public will applicable.

	public static void main(String[] args) {
		
		Modifier1 add= new Modifier1();
		System.out.println("Default:"+add.idefault);
		System.out.println("Protected:"+add.iprotected);
		System.out.println("Public:"+add.ipublic);

	}

}
