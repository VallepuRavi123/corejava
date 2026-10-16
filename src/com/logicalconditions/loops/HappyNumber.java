package com.logicalconditions.loops;

import java.util.Scanner;
public class HappyNumber {
	static int happy(int n) {
		int sum=0;
		int rem=0;
		while(n>0) {
			rem=n%10;
			sum+=rem*rem;
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int x=happy(n);
		while(true) {
			System.out.println(x);
			if(x==1) {
				System.out.println("Happy Number ");
				break;
			}
			else if(x==4) {
				System.out.println("not an happy number ");
				break;
			}
			else {
				x=happy(x);
			}
		}
	}

		
	}

