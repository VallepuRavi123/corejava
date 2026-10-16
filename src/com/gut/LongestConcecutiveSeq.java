package com.gut;

import java.util.HashSet;

public class LongestConcecutiveSeq {

	public static void main(String[] args) {
		// 1. Write a Java program to find the length of the longest consecutive
		// elements sequence in an unsorted array using a HashSet.
		// Input: [100, 4, 200, 1, 3, 2]
		// Output: 4
		HashSet<Integer> set = new HashSet<>();
		int arr[] = { 100, 4,5,6, 200, 1, 2 };
		int count=0;
		int max_count=0;
		for(int i:arr) {
			set.add(i);
		}
		for(int i:set) {
			if(!set.contains(i-1)) {
				int j=i;
				while(set.contains(j+1)) {
					count++;
					j++;
				}
				if(count>max_count) {
					max_count=count;
				}
			}
		}
		System.out.println(max_count);
	}

}
