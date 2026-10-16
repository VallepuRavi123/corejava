package com.logicalconditions.loops;

import java.util.Scanner;

public class fibanocci {
	static int fibnocci(int n) {
		int result=0;
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else {
		result=fibnocci(n-1)+fibnocci(n-2);
		}
		return result;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for n : ");
		int n=sc.nextInt();
//		int x=fibnocci(n);
		int x=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				int k=0;
				for(int col=0;col<j;col++) {
					k+=n-col;
				}
				k+=i-j;
			//	System.out.print(k);
				System.out.print(fibnocci(k)+" ");
				x++;
				}
			
			System.out.println();
		}
		}
		
	
			//System.out.println(result3);
			
	}
