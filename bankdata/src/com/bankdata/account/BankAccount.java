package com.bankdata.account;

public class BankAccount {

	private String account_no;
	private double balance;
	private String customer_name;
	private String customer_email;
	private int customer_phonenumber;

	public void depositMoney(double addMoney) {
		this.balance += addMoney;
		System.out.println("Balance is: " + this.balance);
	}

	public void withdrawMoney(double withdrawMoney) {
		if (this.balance - withdrawMoney < 0) {
			System.out.println("Cannot withdraw money");
		} else {
			this.balance -= withdrawMoney;
			System.out.println("Remaining balance is: " + this.balance);
		}

	}

	public String getAccount_no() {
		return account_no;
	}

	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_email() {
		return customer_email;
	}

	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}

	public int getCustomer_phonenumber() {
		return customer_phonenumber;
	}

	public void setCustomer_phonenumber(int customer_phonenumber) {
		this.customer_phonenumber = customer_phonenumber;
	}

}
