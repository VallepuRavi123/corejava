package com.logicalconditions.loops;

import java.util.Scanner;

public class SumOfNumbers1 {
static int sum=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int n=sc.nextInt();
		
		System.out.println(sum(i,n));

	}
	 static int sum(int i,int n){
		if(i<n) {
			 sum+=i+n;
			i++;
			n--;
			sum(i,n);
		}
		else if(n==i) {
		sum+=n;
		}
		return sum;
	}
}
