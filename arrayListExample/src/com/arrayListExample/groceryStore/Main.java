package com.arrayListExample.groceryStore;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GroceryList grocerylist = new GroceryList();
		grocerylist.addItem("Cheese");
		grocerylist.addItem("Tomato");
		grocerylist.addItem("Beer");

		grocerylist.printItem();
		grocerylist.modifiedItem(1, "Schokolade");
		// grocerylist.removeItem(1);
		grocerylist.findItem("cheese");
		grocerylist.printItem();

	}

}
