package com.languagefundamentals;

import java.util.Scanner;

public class Arthamatic {

	public int addition(int a,int b) {
		int add=a+b;
		return add;
	}
	public int subtraction(int a,int b) {
		int sub=a-b;
		return sub;
	}
	public int mul(int a,int b) {
		int mul=a*b;
		return mul;
	}
	public int div(int a,int b) {
		int div =a/b;
		return div;
	}
	public int mod() {
		int a=20;
		int b=17;
		int mod=a%b;
		return mod;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for a : " );
		int a =sc.nextInt();
		System.out.println("Enter value for b : ");
		int b=sc.nextInt();
		System.out.println("******************");
		Arthamatic x=new Arthamatic();
		System.out.println("The details of operations is ");
		System.out.println("The addition of two numbers is "+x.addition(a,b));
		System.out.println("The subtraction of two numbers is "+x.subtraction(a,b));
		System.out.println("The mul of two numbers is "+x.mul(a,b));
		System.out.println("The division of two numbers is "+x.div(a,b));
		System.out.println("The reminder of two numbers is "+x.mod());
		sc.close();
	}

}
