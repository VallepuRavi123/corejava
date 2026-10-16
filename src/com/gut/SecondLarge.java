package com.gut;

public class SecondLarge {
	static int max(int[]arr) {
		int max=Integer.MIN_VALUE;
		int secondmax=Integer.MIN_VALUE;
		for(int i:arr) {
			if(i>max) {
				secondmax=max;
				max=i;
			}
			else if(i>secondmax && i!=max) {
				secondmax=i;
			}
		}
		return secondmax;
	}

	public static void main(String[] args) {
		int[] arr= {25,25,25,-10,-7,-8};
		System.out.println(max(arr));

	}

}
