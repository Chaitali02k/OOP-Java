package polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			Movie movie = randomMovie();
			Movie movie1 = new Jaws();
			System.out.println(movie1.plot());
			System.out.println("Movie" + i + ":" + movie.getMoviename() + "\n" + "Plot" + movie.plot() + "\n");
		}

	}

	public static Movie randomMovie() {
		int randomNumber = (int) (Math.random() * 4) + 1;
		System.out.println("Random number is :" + randomNumber);
		switch (randomNumber) {
		case 1:
			return new Jaws();
		case 2:
			return new Independence();
		case 3:
			return new StarWars();
		case 4:
			return new forgettable();
		}

		return null;
	}

}
