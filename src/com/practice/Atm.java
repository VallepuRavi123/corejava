package com.practice;

public class Atm {
	static String bankName="SBI";
	int balance;
	int accno;
	void deposit() {
		System.out.println("The bank name is "+Atm.bankName);
		checkbalance();
		int add=1000;
		balance+=add;
		//System.out.println("The bank name is "+Atm.bankName);
		System.out.println("The account number is :"+accno);
		System.out.println("After depositing amount is : ");
		checkbalance();
	}
	void withdraw() {
		int sub=2000;
		balance-=sub;
		System.out.println("After withdraw amount is : ");
		checkbalance();
	}
	void checkbalance() {
		System.out.println("balace is "+balance);
	}

	public static void main(String[] args) {
		Atm a=new Atm();
		a.balance=5000;
		a.accno=123456;
		a.deposit();
		a.withdraw();
	}

}
