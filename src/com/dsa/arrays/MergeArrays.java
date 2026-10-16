package com.dsa.arrays;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		int[] n = { 1,3,5,7};
		int[] n2 = {10, 8, 6, 4};
		int[] n3 = new int[n.length + n2.length];
		int k = 0;
		System.out.println(Arrays.toString(n3));
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n2.length;j++) {
				if(n[i]>=n2[j]) {
					n3[k++]=n2[j];
					n3[k]=n[i];
				}
				n3[k++]=n[i];
			}
		}
	}
}