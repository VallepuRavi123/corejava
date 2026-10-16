package com.dsa;

import java.util.Arrays;

public class SumStroreInAnotherArray {

	public static void main(String[] args) {
		int n[]= {1,2,3,4,5,6,6,7,8};
		int n1[]= {1,2,3,4,6,7};
		int[] n3=new int[n.length];
		for(int i=0;i<n1.length;i++) {
			n3[i]=n[i]+n1[i];
			//n3[i+n1.length]=n[i+n1.length];
		}
		for(int i=0;i<n.length-n1.length;i++) {
			n3[i+n1.length]=n[i+n1.length];
		}
		
		System.out.println(Arrays.toString(n3));
	
	}

}
