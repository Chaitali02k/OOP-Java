package encapsulation;

public class Printer {

	private int tonerLevel;
	private int numberOfPages;
	private boolean duplexprinter;

	public Printer(int tonerLevel, boolean duplexprinter) {

		if (tonerLevel > -1 && tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;
		} else {
			this.tonerLevel = -1;
		}
		this.duplexprinter = duplexprinter;
		this.numberOfPages = 0;
	}

	public int filltoner(int tonner) {
		if (tonner > 0 && tonner <= 100) {
			if (tonner + this.tonerLevel > 100) {
				return -1;
			}
			this.tonerLevel += tonner;
			return this.tonerLevel;

		} else {
			return -1;
		}
	}

	public int numberofpages(int pages) {
		int pagestoprint = pages;
		if (this.duplexprinter) {
			pagestoprint /= 2;
			System.out.println("printing in duplex mode");
		}
		this.numberOfPages += pagestoprint;
		return pagestoprint;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

}
