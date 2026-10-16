package com.dsa.arrays;

import java.util.Scanner;

public class PrimeUptonumber {
	static boolean isprime(int n) {
		if(n==1 || n==0) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	static void prime(int n) {
		int temp=n,x=n;
		int t=10;
		int rem=0;
		while(x>0) {
			while(temp>t/10) {
			rem=temp%t;
			if(isprime(rem)) {
				System.out.print(rem+" ");
			}
			temp/=10;
			}
			temp=n;
			t=t*10;
			x/=10;
			
			
		}
		
}
		
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		prime(n);
		//System.out.println(isprime());

	}

}
