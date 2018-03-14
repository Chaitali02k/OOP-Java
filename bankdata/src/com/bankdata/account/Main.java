package com.bankdata.account;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount accountDetails = new BankAccount();
		
		accountDetails.setAccount_no("A12345");
		accountDetails.setCustomer_name("John");
		System.out.println("Account number is:"+accountDetails.getAccount_no() +" of customer: "+accountDetails.getCustomer_name());

		accountDetails.depositMoney(500);
		accountDetails.withdrawMoney(10);

		accountDetails.withdrawMoney(200);
		accountDetails.withdrawMoney(200);

		accountDetails.depositMoney(100);

	}

}
