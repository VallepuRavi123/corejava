package com.logicalconditions;

import java.util.Scanner;

public class AtmManagementSystem{
	{
		System.out.println("************WELCOME TO THE SBI ATM**********");
	}
	static String s;
	static Scanner sc=new Scanner(System.in);
	static String name="Ravi ";
	static long accno=37728184363l;
	static int pin=12345;
	static double balance=100000;
	static double dailylimt=40000;
	static double limit;
	
	static String branch="J.PANGULURU";
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your pin ");
		int pin=sc.nextInt();
		if(pin==AtmManagementSystem.pin) {
			System.out.println("Your pin is validated !!");
			
			do {
			System.out.println("The display is  : ");
			System.out.println("1.ACCOUNT DETAILS ");
			System.out.println("2.DEPOSIT ");
			System.out.println("3.WITHDRAW ");
			System.out.println("4.CHECK BALANCE ");
			System.out.println("********************************************");
			System.out.println("Enter choice");
			int n=sc.nextInt();	
		switch(n){
		case 1->{
			accountdetails();
		}
		case 2->{
			deposit();
		}
		case 3->{
			withdraw();
		}
		case 4->{
			checkbalance();
		}
		default->{
			System.out.println("Enter a valid choice : ");
		}
		
		}
		System.out.println("Do you want to continue the transactions !!! click yes for continue or click no for exit");
		s=sc.next();
		}while(s.equalsIgnoreCase("yes"));
			System.out.println("Exit");
		}
		else{
			System.out.println("Incorrrect pin ");
	
		}

	}
		
		
	static void accountdetails() {
		System.out.println("The account holder name is : "+name);
		System.out.println("The account holder account number is "+accno);
		System.out.println("The branch is  "+branch);
	}
	static void deposit() {
		System.out.println("Enter amount for deposit : ");
		double amount=sc.nextDouble();
		balance+=amount;//balance=balance+amount;
		System.out.println("Amount added sucessfully !!!");
		}

	static void withdraw() {
		System.out.println("Enter amount for withdraw ");
		double amount=sc.nextDouble();
		if(amount<=dailylimt) {
			if(amount<balance) {
				dailylimt-=amount;
				balance-=amount;
				System.out.println("Withdraw amount "+amount+"sucessfully!!");
			}
			else {
				System.out.println("Insufficient balance !!!");
			}
		}
		else {
			System.out.println("Daily limit exceeded  try after 24 hours !!!");
		}
		
	}
	static void checkbalance() {
			System.out.println("The balance is "+balance);
	}
}
	
	
	
	