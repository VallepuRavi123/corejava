package com.languagefundamentals;

import java.util.Scanner;

public class Task01 {
	static Scanner sc = new Scanner(System.in);

	public Task01(int rupee, int cost) {
		if (cost > rupee) {
			System.out.println("You dont  have sufficient amount for the buying the penccils");

		} else {
			int total_peices = rupee / cost;
			// int remaining=rupee-total_peices*cost;
			int remaining = rupee % cost;
			System.out.println("The total peices : " + total_peices);
			System.out.println("The remainig amount " + remaining);
		}
	}

	public static void main(String[] args) {
		// Task01 t=new Task01(rupee,cost);
		System.out.println("Enter value for rupees :  ");
		int rupee = sc.nextInt();
		System.out.println("Enter cost of the pencils ");
		int cost = sc.nextInt();
		new Task01(rupee, cost);
		// t.check(rupee,cost);
		sc.close();
	}

}

//1. Write a Java Program to complete Below Requirements 

//A user have 100 rupees and he is about to buy pencil costs 7 rupees

//a) find how many pencils he buy with the money he have and find the amount left after shopping 
