package polymorphism;

public class Movie {

	private String moviename;

	public Movie(String moviename) {
		this.moviename = moviename;
	}

	public String plot() {
		return "no plot here";
	}

	public String getMoviename() {
		return moviename;
	}
	
	

}
