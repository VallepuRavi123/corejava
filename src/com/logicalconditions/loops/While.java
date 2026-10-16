package com.logicalconditions.loops;

import java.util.Scanner;

public class While {
	public static void main() {
		
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int count=0;
	
	while(n>0) {
		if(n%2==0) {
			count++;
			System.out.println(n);
			System.out.println("********************");
		
			n/=2;
			if(n==1) {
				System.out.println(n);
				break;
			}
		}
		else {
			System.out.println(n);
			count++;
			n=n*3+1;
		}
	}
	System.out.println("count"+count);
	}
	
}
