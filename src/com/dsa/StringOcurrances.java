package com.dsa;

import java.util.Scanner;

public class StringOcurrances {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String for printing : ");
		String s=sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
//			if (Character.isLetter(s.charAt(i))) {
//				i++;
//			}
			if (Character.isDigit(s.charAt(i))) {
				int n = Character.getNumericValue(s.charAt(i));
				while (n > 0) {
					System.out.print(s.charAt(i - 1));
					n--;
				}
			}
		}
sc.close();
	}
}
