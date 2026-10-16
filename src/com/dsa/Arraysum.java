package com.dsa;

import java.util.Arrays;

public abstract class Arraysum {
	static int[] sumarray(int[] numbers) {
		int sum=0;
		int avg=0;
		for(int i=0;i<numbers.length;i++) {
			sum+=numbers[i];
		}
		avg=sum/numbers.length;
		int arr[]= {sum,avg};
	return arr;
	}

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5};
		for(int i:sumarray(numbers)) {
			System.out.print(i +" " );
		}
		System.out.println();
		System.out.println(Arrays.toString(sumarray(numbers)));

	}

}
