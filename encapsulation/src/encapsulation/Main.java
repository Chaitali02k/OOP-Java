package encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer printer=new Printer(50,true);
		System.out.println("printer is printing pages:"+printer.getNumberOfPages());	
		int pagePrinted=printer.numberofpages(4);
		System.out.println("pages printed:"+printer.getNumberOfPages());
	}

}
