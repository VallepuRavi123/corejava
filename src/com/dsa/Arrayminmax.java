package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayminmax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size :");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			//System.out.print("Enter value for "+i+" th position :");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int value:arr) {
			System.out.print(value+" ");
		}
		String s=Arrays.toString(arr);
		//System.out.println(Arrays.toString(arr));
		System.out.println(s);
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			else if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("The min value of an array is "+min);
		System.out.println("The max value of the array is"+max);
		
		sc.close();
	}

}
