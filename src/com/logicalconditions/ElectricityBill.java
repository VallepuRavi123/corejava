package com.logicalconditions;

import java.util.Scanner;

public class ElectricityBill {
	static double  caldomestic(double n) {
		if(n<=300 && n>0) {
			return n*2;
		}
		else if(n>300) {
			return 2*300+3*(n-300);
		}
		return 0;
	}
	static double calcommercial(double n) {
		if(n<=100 && n>0) {
			return n*4;
		}
		else if(n>100 && n<=300) {
			return 100*4+(n-100)*6;
		}
		else if(n>300) {
			return 100*4+200*6+(n-300)*8;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Domestic ");
		System.out.println("2.Commercial ");
		System.out.println("Enter your connection type  ");
		int choice=sc.nextInt();
		System.out.println("Enter no of units consumed ");
		double units=sc.nextDouble();
		switch(choice) {
		case 1->{
			System.out.println("The Electricity bill of the domestic is "+caldomestic(units));
		}
		case 2->{
			System.out.println("The Electricity bill for  for commercial is "+caldomestic(units));
		}
		default->{
			System.out.println("Invaid choice ");
		}
		}
//		System.out.println("The total electricity bill is "+caldomestic(units)+caldomestic(units));
	}

}
