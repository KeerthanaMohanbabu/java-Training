package day18java;

public class Modifier1 {
	
	/**
	 * Modifiers --> It will define the scope to a variables, Constructor,method and class .
	 * 
	 *  4-Types of Modifiers
	 *  =====================
	 *   - private
	 *   - default
	 *   - protected
	 *   - public
	 *   
	 *  Class level possible Modifiers- Public & Default [example: public class Modifier1 & "class Modifier1"-Default]
	 */
	private int iprivate=10;
	int idefault=20;
	protected int iprotected=30;
	public int ipublic=40;
	
	/**public void display() {// Other way to display it.
		
		System.out.println("Private:"+iprivate);
		System.out.println("Default:"+idefault);
		System.out.println("Protected:"+iprotected);
		System.out.println("Public:"+ipublic);
		}
	*/

	public static void main(String[] args) {
		
		Modifier1 add= new Modifier1();
		System.out.println("Private:"+add.iprivate); // Another way to display it.
		System.out.println("Default:"+add.idefault);
		System.out.println("Protected:"+add.iprotected);
		System.out.println("Public:"+add.ipublic);
		
		//add.display();
	}

}
