package arrayListDuplicateElement;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

//How to remove duplicate element from ArrayList
public class ArrayListDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(4);
		numbers.add(4);
		numbers.add(6);
		numbers.add(8);

		System.out.println("ArrayList with duplicate Value:" + numbers);
		
		Set<Integer> numberWithoutDuplicate= new LinkedHashSet<>(numbers);
		System.out.println("ArrayList with duplicate Value:" + numberWithoutDuplicate);
		

	}

}
