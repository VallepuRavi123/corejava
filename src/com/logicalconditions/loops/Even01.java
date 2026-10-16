package com.logicalconditions.loops;

import java.util.Scanner;

public class Even01 {
	static int ntheven(int n) {
		int count=0;
		int even=0;
		int i=1;
		while(n>0) {
			//int i=1;
			if(i%2!=0) {
				count++;
			}
			if(count==n) {
				//even=i;
				break;
			}
			i++;
		}
		return i;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value for n :");
		int n = sc.nextInt();
		System.out.println(ntheven(n));
}

}
