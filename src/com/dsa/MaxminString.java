package com.dsa;

import java.util.Scanner;

public class MaxminString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] s= new String[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter "+i+ " String : ");
			s[i]=sc.next();
		}
		String min=s[0];
		String max=s[0];
		for(int i=0;i<s.length;i++) {
			if(s[i].length()<min.length()) {
				min=s[i];
			}
			else if(s[i].length()>max.length()) {
				max=s[i];
			}
		}
		System.out.println("The mimimum string in the array is : "+min);
		System.out.println("The mimimum string in the array is : "+max);
	
	}
	

}
