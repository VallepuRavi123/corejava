package com.gut;

import java.util.HashSet;

public class SubArray {

	public static void main(String[] args) {
		// 2. Write a Java program to check whether array B 
		//is a subset of array A usinga HashSet.
		// A = [1, 2, 3, 4]
		// B = [2, 3]
		// Output: Is B a subset of A? : true
		int []arr= {1, 2, 3, 4,5,6};
		int []arr2= {2,3,5,6};
		HashSet<Integer>set=new HashSet<>();
		boolean status=true;
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			if(!set.contains(arr2[i])) {
				status=false;
				break;
			}
		}
			System.out.println("Is B a subset of A : "+status);
		
	}

}
