package day14java;

public class Thiskeywordhw {

	String name="keerthi";
	String gender="Female";
	int age = 23;
	
	public Thiskeywordhw(String name, int age) {
		name= name;
		age=age;
		//System.out.println("Canditate name:"+name);
		//System.out.println("Canditate Age:"+age);
		
	}
	
	public Thiskeywordhw(String name, String gender, int age) {
		this.name= name;
		this.gender= gender;
		this.age=age;
		
	}
	
	public void display() {
		System.out.println("Canditate name:"+name);
		System.out.println("Canditate Gender:"+gender);
		System.out.println("Canditate Age:"+age);
	}
	
	public static void main(String[] args) {
		Thiskeywordhw add=new Thiskeywordhw("Ram","Male",25);
		add.display();
		
		Thiskeywordhw add1=new Thiskeywordhw("Ram",26);
		add1.display();
		
		
	}

}
