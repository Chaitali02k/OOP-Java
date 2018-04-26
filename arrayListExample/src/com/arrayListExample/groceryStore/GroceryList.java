package com.arrayListExample.groceryStore;

import java.util.ArrayList;

public class GroceryList {

	private ArrayList<String> groceryList = new ArrayList<>();

	public void addItem(String item) {

		groceryList.add(item);
	}

	public void printItem() {
		for (int i = 0; i < groceryList.size(); i++) {

			System.out.println("Item in grocery list is:" + groceryList.get(i));
		}
	}

	public void removeItem(int position) {

		groceryList.remove(position);

	}

	public void modifiedItem(int position, String newItem) {

		groceryList.set(position, newItem);
	}

	public String findItem(String fintItem) {
		//boolean item=groceryList.contains(fintItem);
		int searchItem=groceryList.indexOf(fintItem);
		if(searchItem>=0) {
			return groceryList.get(searchItem);
		}
		return null;
		
	}
}
