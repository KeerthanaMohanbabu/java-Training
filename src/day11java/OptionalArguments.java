package day11java;

public class OptionalArguments {

	public static void main(String[] args) {
		OptionalArguments optional = new OptionalArguments();
		optional.bookMovieTicket("Mathan");
		optional.bookMovieTicket("Pooja","Vijay","Karthick","Arun","Gopi");
		optional.bookMovieTicketForVijayMovie(9,1,5);
		optional.bookMovieTicketForVijayMovie();
	}

	public void bookMovieTicket(String name,String ...families) {
		System.out.println("Mandatory person name is : "+name);
		if(families.length > 0) {
			for (String familymember : families) {
				System.out.println(familymember);
			}
		}else {
			System.out.println("Enjoying movie alone....");
		}
	}
	
	public void bookMovieTicketForVijayMovie(int ...timings) {
		if(timings.length > 0) {
			for (int timing : timings) {
				System.out.println("Like Vijay Movie ... "+timing);
			}
		}else {
			System.out.println("Dont like Vijay movie ...");
		}
	

	}

}
