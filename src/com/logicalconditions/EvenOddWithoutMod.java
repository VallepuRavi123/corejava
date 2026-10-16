package com.logicalconditions;

public class EvenOddWithoutMod {
	static boolean checkEven(int n) {
		int n1=(n/2)*2;
		return n==n1;
	}

	public static void main(String[] args) {
		for(int i=100;i>0;i--) {
			if(checkEven(i)) {
				System.out.print(i+" ");
			}
	
		}

	}

}
