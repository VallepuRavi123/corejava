package com.practice;

import java.util.Scanner;

public class EvenWithoutMod {

	public static void main(String[] args) {
//		float f1=123;
//		float f2=123.5;
//		float f3=0123;
//		float f4=0123.5f;
//		float f5=123F;
//		float f6=0123F;
//		float f7=0x123f;
//		float f8=0x123.5F;
//		
		
		int a=27;
		System.out.println(a>>1);
		if((a>>1)!=(double)a/2){
			System.out.println("odd");
		}
		else {
			System.out.println("Even");
		}
		int c = (27*2)/2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		if(n%2==0) {
		System.out.println("The given number is even ");
		}
		else {
		System.out.println("The given number is odd ");
		}

	}

}

