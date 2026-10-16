package com.logicalconditions.loops;

import java.util.Scanner;

public class GuessNumber {
	static Scanner sc = new Scanner(System.in);
	static int count=0;
	static String s;
	public static void main(String[] args) {
		int guess = (int) (Math.random() * (100) + 1);
		System.out.println(guess);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		guess(guess, n);
	
	}
	static void guess(int guess, int n) {
//		count++;
//		if(count==3) {
//			System.out.println("you lose the game : ");
//			count=0;
//		}
		if(guess==n) {
			System.out.println("You guessed correct");
			return;
			
		}
		else if(n>guess) {
			count++;
			System.out.println("The number is greater than guess select enter low number ");		
		}
		else {
			count++;
			System.out.println("The number is to short enter big number to previous ");
		}
		
		System.out.println("Enter another number : ");
		int n1=sc.nextInt();
		guess(guess,n1);
		 //guess(guess,n1);
		}
	}

