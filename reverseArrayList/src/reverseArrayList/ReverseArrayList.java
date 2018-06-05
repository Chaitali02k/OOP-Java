package reverseArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(3);
		numbers.add(5);
		numbers.add(33);
		numbers.add(12);
		
		System.out.println("Element in order:"+numbers);
		
		Collections.reverse(numbers);
		
		System.out.println("Elements in reverse order"+numbers);

	}

}
