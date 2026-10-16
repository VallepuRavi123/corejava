package com.logicalconditions;

import java.util.Scanner;

public class MaxFactor {
	static int max(int n) {
		int max=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
				if(i>max) {
					//System.out.print(i+" ");
					max=i;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(max(n));

	}

}
