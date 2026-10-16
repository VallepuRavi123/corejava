package com.dsa.arrays;

import java.util.HashSet;

public class FindDuplicateUsingHashSet {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,4,4,5,5,5,6,1};
		HashSet<Integer>set=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(!set.add(arr[i])) {
				System.out.println(arr[i]);
			}
			set.add(arr[i]);
		}

	}

}
