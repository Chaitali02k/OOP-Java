package exceptioncheck;

import java.util.Arrays;

public class StingSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "name:John;city:New York";
		String[] parseValue = name.split(";");

		String newString = Arrays.toString(parseValue);

		String[] value = newString.split(":");
		
		
		

		
	

	}

}
