package com.languagefundamentals.methods;

import java.util.Scanner;

public class RentalPrice {
	static double insuranceAmount() {
		return 500;
	}
	static int daycount(int days) {
		return days;
	}
	static double perdayRent() {
		return 1500;
	}
	static double calcost(int days) {
		double cost=daycount(days)*perdayRent();
		return cost;
	}
	static double insurance(double total) {
		
		return total+insuranceAmount();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for no of days : ");
		int days=sc.nextInt();
		double total=calcost( days);
		System.out.println("The total Rent for car"+total);
		//double in_amount=insuranceAmount();
		double a=insurance(total);
		System.out.println("The total rent after adding insurance : "+a);
		sc.close();
	}

}
