package com.dsa.arrays;

import java.util.HashMap;

public class UniqueEle {

	public static void main(String[] args) {
		int[] arr= {4,5,2,4,5,1,6};
		System.out.println(4^4);
		System.out.println(4^5);
		System.out.println(4^0);
		//int count=1;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=0;j<arr.length;j++) {
				if( i!=j && arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1)
			System.out.print(arr[i]+ " ");
		//System.out.println(count);

	} //using hash map
		HashMap<Integer,Integer> hash=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
				hash.put(arr[i],hash.getOrDefault(arr[i], 0)+1);
			}
		
		System.out.println(hash);
		for(int i=0;i<arr.length;i++) {
			if(hash.get(arr[i])==1) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		// using XOR; {4,5,2,4,5}
		int unique=0;
		for(int i:arr) { 
			unique=unique^i;
		}
		System.out.print(unique);
		
		}
		
	}

