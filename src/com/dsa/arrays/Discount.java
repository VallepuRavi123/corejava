
package com.dsa.arrays;

import java.util.Arrays;

public class Discount {

	public static void main(String[] args) {
		int []arr= {8,4,6,2,5,8,1};
		//int []arr= {-2,-3,-5,-7,-11};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]) {
					arr[i]=arr[i]-arr[j];
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
